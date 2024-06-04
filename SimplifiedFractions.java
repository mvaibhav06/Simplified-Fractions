class SimplifiedFractions {
    public int gcd(int a, int b){
        return b==0 ? a : gcd(b,a%b);
    }
    public String simplify(int a, int b){
        int gcd = gcd(a,b);
        return a/gcd + "/" + b/gcd;
    }
    public List<String> simplifiedFractions(int n) {
        List<String> out = new ArrayList<>();
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                String s = simplify(i,j);
                if(!out.contains(s)){
                    out.add(s);
                }
            }
        }
        return out;
    }
}
