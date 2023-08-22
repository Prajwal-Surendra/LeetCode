/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode* node = head;
    if(head == NULL)
        return NULL;
    while(node->next != NULL)
    {
        if(node->val == node->next->val)
        {
            node->next=node->next->next;
        }
        else
        {
            node=node->next;
        }
    }
    return head;
}