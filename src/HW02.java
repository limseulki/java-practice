import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String structureName = sc.nextLine();
        String title = sc.nextLine();

        switch(structureName){
            case "List" :
                ArrayList<String> strList = new ArrayList<>();
                while(true){
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")){
                        break;
                    }
                    strList.add(text);
                }
                System.out.println("[ "+structureName+" 으로 저장된 "+title+" ]");
                for(int i = 0; i < strList.size(); i++){
                    System.out.println((i+1) + ". " + strList.get(i));
                }
                break;

            case "Set" :
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while(true){
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")){
                        break;
                    }
                    strSet.add(text);
                }
                System.out.println("[ "+structureName+" 으로 저장된 "+title+" ]");
                Iterator iterator = strSet.iterator();
                for(int i = 0; i < strSet.size(); i++){
                    System.out.println((i+1) + ". " + iterator.next());
                }
                break;

            case "Map" :
                Map<Integer, String> strMap = new HashMap<>();
                int num = 1;
                while(true){
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")){
                        break;
                    }
                    strMap.put(num++, text);
                }
                System.out.println("[ "+structureName+" 으로 저장된 "+title+" ]");
                for(int i = 0; i < strMap.size(); i++){
                    System.out.println((i+1) + ". " + strMap.get(i+1));
                }
                break;
            default :
                System.out.println("저장할 수 없는 자료구조입니다.");
        }
    }
}