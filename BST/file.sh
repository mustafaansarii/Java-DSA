#!/bin/bash

# List of problems with category, filename, and URL
problems=(
  # Easy
  "Easy Ceil_in_BST.java https://leetcode.com/problems/ceil-in-a-binary-search-tree"
  "Easy Floor_in_BST.java https://leetcode.com/problems/floor-in-a-binary-search-tree"
  "Easy Insert_in_BST.java https://leetcode.com/problems/insert-into-a-binary-search-tree"
  "Easy Introduction_to_BST.java https://leetcode.com/problems/introduction-to-binary-search-tree"
  "Easy Search_in_BST.java https://leetcode.com/problems/search-in-a-binary-search-tree"
  "Easy Search_and_Insertion.java https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/"

  # Medium
  "Medium Delete_in_BST.java https://leetcode.com/problems/delete-node-in-a-binary-search-tree"
  "Medium Find_Kth_in_BST.java https://leetcode.com/problems/kth-smallest-element-in-a-bst"
  "Medium Check_BST_or_BT.java https://practice.geeksforgeeks.org/problems/check-for-bst/1"
  "Medium LCA_in_BST.java https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1"
  "Medium Construct_BST_from_Preorder.java https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversa/"
  "Medium Inorder_Successor_in_BST.java https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1"
  "Medium Two_Sum_in_BST.java https://leetcode.com/problems/two-sum-iv-input-is-a-bst"
  "Medium Find_Min_Max_in_BST.java https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1"
  "Medium Binary_Tree_to_BST.java https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1"
  "Medium Count_BST_Nodes_in_Range.java https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1"
  "Medium Brothers_from_Different_Root.java https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1"
  "Medium Find_Median_in_BST.java https://www.geeksforgeeks.org/find-median-bst-time-o1-space/"
  "Medium Check_Whether_BST_Contains_Dead_End.java https://practice.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1"
  "Medium Preorder_to_Postorder.java https://practice.geeksforgeeks.org/problems/preorder-to-postorder/0"
  "Medium Populate_Inorder_Successor.java https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1"

  # Hard
  "Hard Merge_2_BSTs.java https://leetcode.com/problems/merge-two-binary-search-trees"
  "Hard Recover_BST.java https://leetcode.com/problems/recover-binary-search-tree"
  "Hard Largest_BST_in_Binary_Tree.java https://www.geeksforgeeks.org/largest-bst/"
  "Hard Convert_Normal_BST_to_Balanced_BST.java https://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/"
  "Hard Flatten_BST_to_Sorted_List.java https://www.geeksforgeeks.org/flatten-bst-to-sorted-list-increasing-order/"
)

# Create directories
mkdir -p Easy Medium Hard

# Create .java files
for problem in "${problems[@]}"; do
  IFS=' ' read -r category filename url <<< "$problem"
  filepath="$category/$filename"

  # Check if the file already exists
  if [[ ! -f "$filepath" ]]; then
    class_name=$(echo "$filename" | sed -E 's/\.java$//')
    echo "// Problem URL: $url" > "$filepath"
    echo "// TODO: Implement the solution" >> "$filepath"
    echo >> "$filepath"
    echo "public class $class_name {" >> "$filepath"
    echo "    // TODO: Implement the solution for $filename" >> "$filepath"
    echo "}" >> "$filepath"
    
    echo "Created $filepath"
  else
    echo "$filepath already exists, skipping."
  fi
done
