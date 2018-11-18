package com.company;

public class kadai4 {
    public static void main(String[] args){
        System.out.println("  【java旅行】  ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("行きたい場所を入力してください");
        String place = new java.util.Scanner(System.in).nextLine();

        String[] questions ={"1:ぬかるんだ道\r\n2:舗装された道" , "1:落とし穴\n2:けものみち\n3:疲れた" , "\n1:村に入る\n2:そのまま通り過ぎる\n3:村を襲う" , "1:もと来た道に戻る\n2:先に進む" , "1:あきらめる\n2:帰る"};
        String[] answer={"残念行き止まりです" , "正解です！！！" , "そんな道はありません！" , "冷静になってください！" , "ゲームを終了します" , "よくこの道を見つけましたね。\r\n真のゲームクリアです！！！"};

        
        System.out.println("ようこそ、" + age + "歳の" + name + "さん。\r\n１と２のどっちの道に進みますか？");
        for (int j = 0; j < 5; j++) {
            System.out.println(questions[0]);
            int road1 = new java.util.Scanner(System.in).nextInt();
            if (road1 == 1) {
                System.out.println(answer[0]);
                continue;
            } else if (road1 == 2) {
                System.out.println(answer[1]);
                break;
            } else {
                System.out.println(answer[2]);
                continue;
            }
        }
        System.out.println("\r\nさらなる道がありました！" + name + "さん。どうしますか？");
        for (int i = 0; i < 5; i++) {
            System.out.println(questions[1]);
            int road2 = new java.util.Scanner(System.in).nextInt();
            if (road2 == 1) {
                System.out.println(answer[0]);
                continue;
            } else if (road2 == 2) {
                System.out.println(answer[1]);
                break;
            } else if (road2 == 3) {
                System.out.println(answer[3]);
                continue;
            } else {
                System.out.println(answer[2]);
                continue;
            }
        }
        System.out.println("\r\nさらなる道がありました！" +name + "さん。\nどうしますか？");
        for (int k = 0; k < 5; k++) {
            System.out.println(questions[2]);
            int road3 = new java.util.Scanner(System.in).nextInt();
            if (road3 == 1) {
                System.out.println(answer[3]);
                continue;
            } else if (road3 == 2) {
                System.out.println(answer[1]);
                break;
            } else if (road3 == 3) {
                System.out.println(answer[3]);
                continue;
            } else {
                System.out.println(answer[2]);
                continue;
            }
        }
        System.out.println("\r\nさらなる道がありました！" +name + "さん。\nどうしますか？");
        for (int k = 0; k < 5; k++) {
            System.out.println(questions[3]);
            int road3 = new java.util.Scanner(System.in).nextInt();
            if (road3 == 1) {
                System.out.println(answer[3]);
                continue;
            } else if (road3 == 2) {
                System.out.println(answer[1]);
                break;
            } else {
                System.out.println(answer[2]);
                continue;
            }
        }
        System.out.println(place +"まであと少しです！\r\n"+name + "さん。どうしますか？");
        for (int k = 0; k < 5; k++) {
            System.out.println(questions[4]);
            int road3 = new java.util.Scanner(System.in).nextInt();
            if (road3 == 1) {
                System.out.println(answer[3]);
                continue;
            } else if (road3 == 2) {
                System.out.println(answer[3]);
                continue;
            } else {
                System.out.println(answer[5]);
                break;
            }
        }

     System.out.println(answer[4]);

    }
}
