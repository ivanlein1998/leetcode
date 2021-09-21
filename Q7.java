class Solution {
    public int reverse(int x) {
        String intString = "";
        if(x < 0){
            int newInt = Math.abs(x);
            intString = String.valueOf(newInt);
        }
        else{
            intString = String.valueOf(x);
        }
        int length = intString.length();
        List<String> list=new ArrayList<String>();
        for (int i = 0; i < length; i++){
            list.add(String.valueOf(intString.charAt(i)));
        }
        Collections.reverse(list);
        String str = "";
        for (int i = 0; i < length; i++){             
            str += list.get(i);
        }
        if(x == Integer.MIN_VALUE ||Double.parseDouble(str)> Integer.MAX_VALUE)
            return 0;
        int answer = Integer.parseInt(str);
        if(x < 0){
            answer = answer * -1;
        }
        return answer;
        
    
