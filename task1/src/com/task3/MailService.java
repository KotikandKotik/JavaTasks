package com.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailBox> {

 Map<String, List<T>> mailBox = new HashMap<>();


         @Override
         public void accept(MailBox obj) {
          if (mailBox.get(obj.getTo()) != null) {
                 mailBox.get(obj.getTo()).add((T)obj.getContent());
          }
          else {
           List<T> list = new ArrayList<T>();
             list.add((T)obj.getContent());
              mailBox.put(obj.getTo(), list);
          }
         }



      public Map<String, List<T>> getMailBox() {
          return mailBox;
         }
}

