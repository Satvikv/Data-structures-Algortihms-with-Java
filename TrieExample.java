public class TrieExample{

public TrieNode root;
    TrieExample(){
		root=new TrieNode();
	}

	public void insertIntoTrie(TrieNode root,String data){
		TrieNode newNode=null;
		TrieNode rootNode=root;
		if(root==null){
			  System.out.println("Aaya");
			  return;
		}
		else{
			  for(int i=0;i<data.length();i++){
				if(rootNode.children.containsKey(data.charAt(i)-'a')){
						newNode=rootNode.children.get(data.charAt(i)-'a');						
				}
				else{
					newNode=new TrieNode();
				    newNode.data=data.charAt(i);
					rootNode.children.put(data.charAt(i)-'a',newNode);						
				}
				rootNode=newNode;
				if(i+1==data.length()-1)
					 rootNode.is_leaf=true;	
			  }				 	           
	    }  
    }
	public boolean searchInTrie(TrieNode root, String searchWord){
		TrieNode rootNode=root;
		TrieNode newNode=null;
		boolean searchFound=false;
		for(int i=0;i<searchWord.length();i++){
		   if(rootNode.children.containsKey(searchWord.charAt(i)-'a')){
			  newNode= rootNode.children.get(searchWord.charAt(i)-'a');
			  searchFound=true;
		   }
		   else{
			   searchFound=false;
			   break;
		   }
		   rootNode=newNode;
		}
		return searchFound;
		
		
	}
	
	public static void main(String args[]){
		TrieExample trieTest=new TrieExample();
		
		trieTest.insertIntoTrie(trieTest.root,"bird");
		trieTest.insertIntoTrie(trieTest.root,"birth");
		
		
	}
	  
			  
}			  


