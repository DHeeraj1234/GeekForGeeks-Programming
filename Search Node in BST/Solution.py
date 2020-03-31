class BST:
    def search(self, node, data):
        #code here
        if node==None:
            return 0
        elif node.data==data:
            return 1
        else:
            if node.data>data:
                return self.search(node.left,data)
            if node.data<data:
                return self.search(node.right,data)