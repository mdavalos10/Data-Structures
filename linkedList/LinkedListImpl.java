package linkedList;

public class LinkedListImpl implements LinkedList {


    private ListItem head;

    @Override
    public Boolean isItemInList(String thisItem) {
        ListItem item = head;
        Boolean isinlist = false;
        ListItem i;

       for(i = head; i.next != null; i = i.next){
            if (item.data == thisItem) {
                System.out.println(thisItem + " is in the list");
                isinlist = true;
                break;

            }else{
                item = item.next;
            }
        }
       if (!isinlist){
           System.out.println(thisItem + " is not in list");
           isinlist = true;

       }
        return isinlist;
    }

    @Override
    public Boolean addItem(String thisItem) {
        //get the last item:
        ListItem lastItem = head;
        if (head == null)
            lastItem =  null;
        else {
            lastItem = head;

            //last node points to null
            while (lastItem.next != null)
                lastItem = lastItem.next;
        }
        // create a ListItem, if head is null, set the newItem
        // to be the head
        // else, set the head.next to the newItem
        ListItem newItem = new ListItem(thisItem);
        if (head == null) {
            head = newItem;
        } else {
            lastItem.next = newItem;
        }
        return true;
    }

    @Override
    public Integer itemCount() {
        ListItem item = head;
        int count =0;

        while(item != null){
            item = item.next;
            count++;
        }
        System.out.println("Total Items: " + count);
        return null;
    }

    @Override
    public void listItems() {
        ListItem tmp = head;
        while(tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    @Override
    public Boolean deleteItem(String thisItem) {
        if (head.data == thisItem){
            head = head.next;

        }else{
            ListItem tmp = head;
            while(tmp.next != null){
                if((tmp.next).data == thisItem){
                    tmp.next = (tmp.next).next;
                }else{
                    tmp=tmp.next;
                }
            }
        }
        return false;
    }

    @Override
    public Boolean insertBefore(String newItem, String itemToInsertBefore) {
        ListItem topItem = head;
        ListItem temp;

        while(topItem == head && !(topItem.next).data.equals(itemToInsertBefore)){
            topItem = topItem.next;
            break;
        }

        temp = topItem.next;
        topItem.next = new ListItem(newItem);
        topItem.next.next = temp;

        return true;
    }

    @Override
    public Boolean insertAfter(String newItem, String itemToInsertAfter) {
        ListItem topItem = head;
        ListItem temp;

        while(topItem != null && !topItem.data.equals(itemToInsertAfter)){
            topItem = topItem.next;
        }

        temp = topItem.next;
        topItem.next = new ListItem(newItem);
        (topItem.next).next = temp;

        return true;
    }

    @Override
    public void sort() {
        // TODO Auto-generated method stub

    }

}