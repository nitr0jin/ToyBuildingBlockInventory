<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

#### mainscreen.html
1. Line 14: Linked demo.css as a stylesheet
2. Line 16: Changed the shop title to "The Block"
3. Line 21: Changed H1 to "Shop The Block" and added a class
4. Lines 22-27: Added navigation links
5. Line 28: Gave the <hr> a class name

#### styles.css
1. Lines 1-5: Adjusted the position of the nav to sit on top of the thematic break
2. Lines 7-10: Adjusted the margin and index of the horizontal rule to allow for the h1 and nav to be on top
3. Lines 12-16: Adjusted the h1 margins to sit on top of the horizontal rule at the same level as the nav
4. Lines 18-24: Making the list of links stay on the right side and parallel to each other
5. Lines 26-31: Changing the color and style of the links and adding a left margin
6. LInes 34-38: Making the text change color, and underline on hover

#### Confimationaddpart, ConfirmationAddProduct, conficmationassocpart, confirmationdeletepart, confirmationdeleteproduct, inhousepartform,negativeerror, outsourcedpartform, productform
1. Added bootstrap CSS 

### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### about.html
1. Created the about template
2. Lines 1-17: Created the head for About. Linked the CSS pages. Titled the page "About the Block"
3. Lines 21-28: Created the top of the webpage. Header 1, navigation bar, and thematic break
4. Lines 30-40: Create the story section of the webpage.
5. Line 31: Links an image of people playing with toy bricks
6. Line 33: A header that says "Our Story"
7. Lines 34-38: Briefly talk about the story behind The Brick
8. Lines 42-55: Create the Values section of the webpage
9. Line 43: Puts the h2, h4, and list inside a values container
10. Line 44: H2 header: Values
11. Line 45: H4 header introduces the three C's which are The Brick's core values
12. Lines 46-40: A list that contains the three C's
13.  Line 52L Inputs an image of a child playing with toy bricks

#### mainscreen.html
1. Line 25: Created a link to go to the about page.

#### demo.css
1. Lines 38-43: Put the ourStory div into a flex box to allow the items to be aligned side to side
2. Lines 45-50: The about container allows the h2 header and p to be aligned vertically
3. Lines 52-54: Adjust the picture's width to 50% of the screen
4. Lines 56-61: Put the ourValues div into a flexbox to order the items side to side
5. Lines 63-65: Adjust the picture's width to 50% of the screen
6. Lines 67-72: Aligns the contents in the values container vertically.

#### aboutController.java
1. Line 3: Imports Controller
2. Line 4: Imports GetMapping
3. Line 6: Annotates the controller with @Controller
4. Line 8: Annotates GetMapping for the About page
5. Lines 9-11: A class to get the about page when the link is called.

#### application.properties
1.  Lines 14-16: Configure thymeleaf to serve static resources

#### images
1. Created an images folder
2. Inserted two images for the About page

### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

#### BootStrapData.java
1. Line 42: Added an if statement to ensure that sample part inventory is not duplicated
2. Lines 43-50: Added One Stub Block part to the outsourced part repository
3. Lines 42-59: Added Two Stub Block part to outsourced part repository
4. Lines 61-68: Added L Block to outsourced part repository
5. Lines 70-77: Added flat block to outsourced part repository
6. Lines 78-86: Added Double flat block to outsourced part repository
7. Lines 88-95: Assigning the OutSourcedPart object to the added part variables
8. Lines 97-101: Prints out the company name of the parts
9. Lines 108-118: Adding the sample products to the Product repository.

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

#### mainscreen.html
1. Lines 91-94: Adding a form for the Buy now button with a post method.

#### BuyNowController.java
1. Created the buy now controller for the buy now logic
2. Line 14: Annotating the buy now controller as a controller
3. Lines 17-20: Creating a private Product Repository object with an autowired annotation
4. Lines 24-44: The logic for the buy now button. Checking if the product has appropriate stock and redirects user to the appropriate page.
5. Lines 46-49: Gets the mapping for the purchase success page
6. Lines 51-55: Gets mapping for the purchase error page. 

#### purchaseSuccess.html
1. Created the purchase success file for successful purchases
2. Lines 1-17: Head for purchase success. Linked to the demo.css and bootstrap stylesheets
3. Line 16: Entered the title for the page
4. Line 19: Created the div container
5. Line 21: h1 header to thank users for their purchase
6. Lines 23-27: Navigation bar to allow users to return to the homepage
7. Line 29: Thematic break 
8. Line 31: Created the purchase div
9. Line 32: Inserted an image of a brick heart
10. Line 33: h1 that tells the user the purchase is successful
11. Line 34: h2 that encourages the user to come back to the site
12. Line 35: Inserted a link that allows the user to return home

#### purchaseError.html
1. Created the purchase error file for errors 
2. Lines 1-17: Head for purchase error. Linked to the demo.css and bootstrap stylesheets
3. Line 16: Entered the title for the page
4. Line 19: Created the div container
5. Line 21: h1 header to indicate there was an error with the purchase
6. Lines 23-27: Navigation bar to allow users to return to the homepage
7. Line 29: Thematic break
8. Line 31: Created the purchase div
9. Line 32: Inserted an image of a sad brick man
10. Line 33: h1 that tells the user that an error occurred with the purchase
11. Line 34: h2 that apologizes to the user for the inconvenience
12. Line 35: Inserted a link that allows the user to return home

#### demo.css
1. Lines 74-80: Makes the purchase div align in the center of the page
2. Lines 82-84: Ensure that the images in the purchase success and error pages only occupy 50% of the page width
3. Lines 86-89: Makes the thanks h2 italic and a dark grey to differentiate it from the h1 header.
4. Lines 91-65: Makes the link plain and black and displays as an inline block
5. Line 97-100: Makes the home link on hover underline and a light grey to indicate to users that it is a clickable link
6. Lines 102-105: Makes the h1 error message dark red and underlined to indicate there is an error.

#### images
1. Added the heart.jpg image to the folder for the success page
2. Added the sad.jpg image to the folder for the error page

### G.  Modify the parts to track maximum and minimum inventory by doing the following:

#### part.java
1. Line 32: Initiated the minInv integer
2. Line 33: Initiated the maxInv integer
3. Lines 56-63: Constructor that includes minInv and maxInv
4. Line 97: Getter for minInv
5. Line 99: Setter for minInv
6. Line 101: Getter for maxInv
7. Line 103: Setter for maxInv
8. Lines 117-119: Method to verify if inventory falls within the minimum and maximum inventory amounts.

#### BootStrapData.java
1. Line 49-50: Adding minInv and maxInv for the one stub
2. Lines 60-61: Adding minInv and maxInv for two stub
3. Lines 71-72: Adding minInv and maxInv for lBlock
4. Lines 82-83: Adding minInv and maxInv for flat block
5. Lines 93-94: Adding minInv and maxInv for double flat

#### InHousePartForm.html 
1. Lines 25-26: Adding a text input for minimum inventory 
2. Lines 28-29: Adding a text input for maximum inventory

#### OutsourcedPartForm.html
1. Lines 26-27: Adding a text input for minimum inventory
2. Lines 29-30: Adding a text input for maximum inventory

#### Application.Properties
1. Line 6: Changed database name to the-block.db

#### AddInHousePartController.java
1. Line 42: Calling the isInvValid method from parts.
2. Line 43: Using binding result to display error message

#### AddOutsourcedPartController.java
1. Line 43: Calling the isInvValid method from parts.
2. Line 44: Using binding result to display error message

#### Mainscreen.html
1. line 46: Added a table header for minimum inventory
2. line 47: Added a table heart for maximum inventory
3. Line 56: Added a td that contains minimum inventory
4. Line 57: Added a td that contains maximum inventory

### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:

#### AddInHousePartController.java
1. Line 46: Inserted an if statement that checks if the inventory is less than the minimum
2. Line 47: Binding result that indicates the inventory is below the minimum
3. Line 49: Inserted an else if statement that verifies if the inventory exceeds the maximum
4. Line 50: Binding result that indicates there is too much inventory.

#### AddOutsourcedPartController.java
1. Line 47: Inserted an if statement that checks if the inventory is less than the minimum
2. Line 48: Binding result that indicates the inventory is below the minimum
3. Line 50: Inserted an else if statement that verifies if the inventory exceeds the maximum
4. Line 51: Binding result that indicates there is too much inventory.

#### EnufPartsValidator.java
1. Line 38: Added an if statement that checks if increasing the products lowers the part inventory below the minimum

### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### PartTest.java
1. Lines 104-111: Unit test for get minimum inventory
2. Lines 113-120: Unit test for set minimum inventory
3. Lines 123-129: Unit test for get maximum inventory
4. Lines 131-138: Unit test for set maximum inventory.

### J.  Remove the class files for any unused validators in order to clean your code.
1. Deleted DeletePartValidator.java