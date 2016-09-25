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
		TrieExample test=new TrieExample();
		
		test.insertIntoTrie(test.root,"bird");
		test.insertIntoTrie(test.root,"birth");
		test.insertIntoTrie(test.root,"bitch");
		System.out.println("Root is "+test.root.data);
		System.out.println(" Roots 1st child"+test.root.children.get(1).data);
		System.out.println(" 2nd "+test.root.children.get(1).children.get(8).data);
		System.out.println("3rd "+test.root.children.get(1).children.get(8).children.keySet()+" "+test.root.children.get(1).children.get(8).children.values());
		System.out.println("Search result"+ test.searchInTrie(test.root,"bitch"));
	}
	  
			  
}			  


