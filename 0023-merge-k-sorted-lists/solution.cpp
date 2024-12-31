/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverse(ListNode* head){
        ListNode* curr = head;
        ListNode* prev = NULL;
        ListNode* nex;
        while(curr != NULL){
            nex = curr->next;
            curr->next = prev;

            prev = curr;
            curr = nex;
        }
        return prev;
    }

    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int n = lists.size();
        ListNode* head = NULL;
        vector<int>v;
        for(int i = 0;i < n;i++){
            ListNode* ptr = lists[i];
            while(ptr != NULL){
                v.push_back(ptr->val);
                ptr = ptr->next;
            }
        }
        int m = v.size();
        sort(v.begin(),v.end());
        for(int i = 0;i < m;i++){
            ListNode* p = new ListNode(v[i]);
            if(head == NULL){
                head = p;
            }
            else{
                p ->next = head;
                head = p;
            }
        }
        head = reverse(head);
        return head;
    }
};
