/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    if(!list1)
        return list2;
    if(!list2)
        return list1;
    struct ListNode* temp = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* third = temp;
    while(list1 != NULL && list2 != NULL)
    {
        if(list1-> val < list2->val)
        {
            temp -> next = list1;
            temp = temp -> next;
            list1=list1->next;
        }
        else
        {
            temp->next = list2;
            temp = temp -> next;
            list2=list2->next;
        }
    }
    if(list1 == NULL)
    {
        temp->next=list2;
    }
    else 
        temp->next=list1;
    return third->next;
}