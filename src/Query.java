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



    { "_id" : "Consumer", "avgSales" : 380.6654117647059, "avgProfit" : 80.46035294117647 }
    { "_id" : "Home Office", "avgSales" : 296.90681818181815, "avgProfit" : 58.45045454545455 }
    { "_id" : "Corporate", "avgSales" : 431.5657978723404, "avgProfit" : 104.29037234042553 }

    */
}
