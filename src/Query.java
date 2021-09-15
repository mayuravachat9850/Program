public class Query {
    /*
    Write a SQL query to print the names of the students with the same salary
    as their roommate in order of student ids.

    use upgrad;
    # write your code below
    SELECT st.student_name
    FROM student st
     JOIN roommate rm ON (rm.student_id = st.student_id)
    JOIN salary st_salary ON (st.student_id = st_salary.student_id)
    JOIN salary rm_salary ON (rm.roommate_id = rm_salary.student_id)
     WHERE st_salary.salary = rm_salary.salary;



     Minimum and Maximum Order Amounts
    Description
    Write a query to retrieve the minimum and maximum order amounts among the products.
    Table name : orderdetails
    use priceEach * quantityOrdered to find the amount.

    use upgrad;

    select min(priceEach * quantityOrdered) as minAmount, max(priceEach * quantityOrdered) as maxAmount
    from orderdetails;


    Rounded Total and Average Order Amounts
    Description
    Write a query to retrieve the total amount received from all orders, as well as the
    average amount and round the answers to the nearest integer.

    use upgrad;

    select round(sum(priceEach * quantityOrdered)) as roundedTotalAmount,
    round(avg(priceEach * quantityOrdered)) as roundedAvgAmount
    from orderdetails;


    More Filtered Employees
    Description
    Write a query to retrieve the email addresses of all the employees who have an office code of 6 or report to employees with employee number '1088'. Arrange them in the reverse alphabetical order of their first names.
    Table name: employees
    Columns: email, firstName, reportsTo, officeCode
    use upgrad;

    select email
    from employees
    where officeCode = 6 or reportsTo = 1088
    order by firstName desc;


    Aggregation Operations
    { "_id" : "Consumer", "avgSales" : 380.6654117647059, "avgProfit" : 80.46035294117647 }
    { "_id" : "Home Office", "avgSales" : 296.90681818181815, "avgProfit" : 58.45045454545455 }
    { "_id" : "Corporate", "avgSales" : 431.5657978723404, "avgProfit" : 104.29037234042553 }

    db.purchases.aggregate([{$group:{_id:null, total: {$sum: '$Sales'}}}])

######### Additional Practice Questions Mongo DB ############

1.
    The total number of orders present in purchases collection where the profit earned is between 2000 and 3000 is 1.
        The Mongo query used to find the count of all such orders is shown below.
    db.purchases.find({ $and:[{'Profit':{$lte:3000}},{'Profit':{$gte:2000}}]}).count()
2.
    The total number of orders present in purchases collection whose ‘Segment’ is ‘Consumer’ is 170.
        The Mongo query used to find the count of all such orders is shown below.
    db.purchases.find({'Segment':{$in:['Consumer']}}).count()

3.
    The total number of orders present in purchases collection whose ‘Segment’ is either ‘Consumer’ or ‘Corporate’ is 264.
        The Mongo query used to find the count of all such orders is shown below.
    db.purchases.find({'Segment':{$in:['Consumer','Corporate']}}).count()

4.
    The Mongo query used to find the most expensive sales, that is,the maximum value of profit  earned is shown below.
        db.purchases.aggregate([{$group:{_id:null, average: {$max: '$Profit'}}}])
    The following Mongo query is used to find the least expensive sales, that is the minimum value of profit earned.
        db.purchases.aggregate([{$group:{_id:null, average: {$min: '$Profit'}}}])
5.
    The total number of orders present in purchases collection where profit earned is either greater than 2000 or the sales value is less than equal to 3000 is 327.
        The Mongo query used to find the count of all such orders is shown below.
    db.purchases.find({ $or:[{'Profit':{$gt:2000}},{'Sales':{$lte:3000}}]}).count()
6.
    The total number of orders present in purchases collection where the sales value is not less than 100 is 189 .
        The Mongo query used to find the count of all such orders is shown  below.
    db.purchases.find({'Sales':{$not : {$lt:100}}}).count()

7.
    Sorting in MongoDB
    Write a Mongo query to find the orders that have a sales value greater than 500. Then, sort the documents received on the basis
        of profit in ascending order, and print them in pretty manner.
    db.purchases.find({'Sales':{$gt:500}}).sort({'Profit':1}).pretty()

8.
    Aggregation
        What is the total profit earned across all the orders?
    27339.285
    Feedback:
    The following Mongo query is used to find total profit earned across all the orders in the
     purchases collection.
        db.purchases.aggregate([{$group:{_id:null, total: {$sum: '$Profit'}}}])

9.
CRUD
    Create a database named ‘assignment’ and create a collection named ‘books’.
    Then, store the information given below about the books in the collection.
    use assignments
    db.books.insert ({ 'Book_ID': 'IN-2014-76016', 'Author':'J K Rowling', 'Pages':556, 'Price':460})
    db.books.find()

10.
    CRUD
    For same collection -
    Update the number of pages from 556 to 600.
    use assignments
    db.books.update ({'Book_ID' : 'IN-2014-76016'},{ 'Author': 'J K Rowling', 'Pages':600, 'Price':460})
    db.books.find()
    */
}
