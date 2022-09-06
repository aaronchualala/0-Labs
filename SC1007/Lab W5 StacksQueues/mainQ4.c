#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define SIZE 1000 // The limit of expression length

typedef struct _stackNode
{
    char item;
    struct _stackNode *next;
} StackNode;

typedef struct _stack
{
    int size;
    StackNode *head;
} Stack;

void push(Stack *sPtr, char item);
int pop(Stack *sPtr);
char peek(Stack s);
int isEmptyStack(Stack s);

void in2Post(char *, char *);

int main()
{
    char infix[SIZE];
    char postfix[SIZE];

    printf("Enter an infix expression:\n");
    scanf("%[^\n]%*c", infix);

    in2Post(infix, postfix);
    printf("The postfix expression is \n");
    printf("%s\n", postfix);
    return 0;
}

void push(Stack *sPtr, char item)
{
    StackNode *newNode;
    newNode = (StackNode *)malloc(sizeof(StackNode));
    newNode->item = item;
    newNode->next = sPtr->head;
    sPtr->head = newNode;
    sPtr->size++;
}

int pop(Stack *sPtr)
{
    if (sPtr == NULL || sPtr->head == NULL)
    {
        return 0;
    }
    else
    {
        StackNode *temp = sPtr->head;
        sPtr->head = sPtr->head->next;
        free(temp);
        sPtr->size--;
        return 1;
    }
}

char peek(Stack s)
{
    return s.head->item;
}

int isEmptyStack(Stack s)
{
    if (s.size == 0)
        return 1;
    else
        return 0;
}

int getPrecedence(char c)
{
    if (c == '*' || c == '/')
    {
        return 3;
    }
    else if (c == '+' || c == '-')
    {
        return 2;
    }
    else
    {
        return 1;
    }
}

void in2Post(char *infix, char *postfix)
{
    // Write your code here
    Stack S;
    S.size = 0;
    S.head = NULL;
    int i = 0, p = 0;
    while (infix[i] != '\0')
    {
        // printf("%d", infix[i]);
        // alphanumeric
        if ((48 <= infix[i] && infix[i] <= 122))
        {
            postfix[p] = infix[i];
            p++;
        }
        else if (infix[i] == ')')
        {
            while (peek(S) != '(')
            {
                postfix[p] = peek(S);
                p++;
                pop(&S);
            }
            pop(&S);
        }
        else if (infix[i] == '(')
        {
            push(&S, infix[i]);
        }
        // operators
        else
        {
            while (!isEmptyStack(S) && peek(S) != '(' && getPrecedence(peek(S)) >= getPrecedence(infix[i]))
            {
                postfix[p] = peek(S);
                p++;
                pop(&S);
            }
            push(&S, infix[i]);
        }
        i++;
    }
    while (!isEmptyStack(S))
    {
        postfix[p] = peek(S);
        p++;
        pop(&S);
    }
}