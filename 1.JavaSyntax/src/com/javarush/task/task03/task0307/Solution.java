package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        Zerg zerg01 = new Zerg();
        Zerg zerg02 = new Zerg();
        Zerg zerg03 = new Zerg();
        Zerg zerg04 = new Zerg();
        Zerg zerg05 = new Zerg();
        Zerg zerg06 = new Zerg();
        Zerg zerg07 = new Zerg();
        Zerg zerg08 = new Zerg();
        Zerg zerg09 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg01.name = "zerg" + i++;
        zerg02.name = "zerg" + i++;
        zerg03.name = "zerg" + i++;
        zerg04.name = "zerg" + i++;
        zerg05.name = "zerg" + i++;
        zerg06.name = "zerg" + i++;
        zerg07.name = "zerg" + i++;
        zerg08.name = "zerg" + i++;
        zerg09.name = "zerg" + i++;
        zerg10.name = "zerg" + i++;

        Protoss protoss01 = new Protoss();
        Protoss protoss02 = new Protoss();
        Protoss protoss03 = new Protoss();
        Protoss protoss04 = new Protoss();
        Protoss protoss05 = new Protoss();
        protoss01.name = "protoss" + i++;
        protoss02.name = "protoss" + i++;
        protoss03.name = "protoss" + i++;
        protoss04.name = "protoss" + i++;
        protoss05.name = "protoss" + i++;

        Terran terran01 = new Terran();
        Terran terran02 = new Terran();
        Terran terran03 = new Terran();
        Terran terran04 = new Terran();
        Terran terran05 = new Terran();
        Terran terran06 = new Terran();
        Terran terran07 = new Terran();
        Terran terran08 = new Terran();
        Terran terran09 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran01.name = "terran" + i++;
        terran02.name = "terran" + i++;
        terran03.name = "terran" + i++;
        terran04.name = "terran" + i++;
        terran05.name = "terran" + i++;
        terran06.name = "terran" + i++;
        terran07.name = "terran" + i++;
        terran08.name = "terran" + i++;
        terran09.name = "terran" + i++;
        terran10.name = "terran" + i++;
        terran11.name = "terran" + i++;
        terran12.name = "terran" + i++;
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
