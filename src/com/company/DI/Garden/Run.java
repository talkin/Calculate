package com.company.DI.Garden;

public class Run {

    public static void main(String[] args) throws Exception {
        Gardener gardener = new Gardener();
        gardener.clean();
    }

    static class Gardener {

        public void clean() throws Exception {
            Tool toolOne = new ToolOne();
            Grass grass = toolOne.cutGrass();
            fire(grass);
        }

        private void fire(Grass grass) {

        }

    }

}
