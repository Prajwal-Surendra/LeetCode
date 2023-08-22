/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    struct ListNode* cur = head;
    struct ListNode* fow = head;
    struct ListNode* prev = NULL;
    while(fow != NULL)
    {
        fow = fow->next;
        cur->next = prev;
        prev = cur;
        cur = fow;
    }
    return prev;
}