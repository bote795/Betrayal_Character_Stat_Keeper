package io.github.bote795.myapplication;

/**
 * Created by Nick on 4/4/2015.
 */
public class characters {
        public String NAME;
        public String AGE;
        public String HEIGHT;
        public String WEIGHT;
        public String HOBBIES;
        public String BIRTHDAY;
        public Integer[] SPEED_VALUES;
        public Integer SPEED_DEFAULT;
        public Integer[] MIGHT_VALUES;
        public Integer MIGHT_DEFAULT;
        public Integer[] SANITY_VALUES;
        public Integer SANITY_DEFAULT;
        public Integer[] KNOWLEDGE_VALUES;
        public Integer KNOWLEDGE_DEFAULT;
        characters(String NAME, String AGE, String HEIGHT,String WEIGHT,String HOBBIES,String BIRTHDAY,Integer[] SPEED_VALUES, Integer SPEED_DEFAULT,
                   Integer[] MIGHT_VALUES, Integer MIGHT_DEFAULT,Integer[] SANITY_VALUES, Integer SANITY_DEFAULT,
                   Integer[] KNOWLEDGE_VALUES, Integer KNOWLEDGE_DEFAULT)
        {
            this.NAME= NAME;
            this.AGE = AGE;
            this.HEIGHT =HEIGHT;
            this.WEIGHT = WEIGHT;
            this.HOBBIES = HOBBIES;
            this.BIRTHDAY = BIRTHDAY;
            this.SPEED_DEFAULT =SPEED_DEFAULT;
            this.SPEED_VALUES = SPEED_VALUES;
            this.MIGHT_DEFAULT =MIGHT_DEFAULT;
            this.MIGHT_VALUES = MIGHT_VALUES;
            this.SANITY_VALUES = SANITY_VALUES;
            this.SANITY_DEFAULT = SANITY_DEFAULT;
            this.KNOWLEDGE_DEFAULT= KNOWLEDGE_DEFAULT;
            this.KNOWLEDGE_VALUES = KNOWLEDGE_VALUES;

        }

}
