module.exports = (sequelize, DataTypes) => {
    const Person = sequelize.define('Person', {
        Firstname: {
            type: DataTypes.STRING
        },
        Lastname: {
            type: DataTypes.STRING
        },
        Profession: {
            type: DataTypes.STRING
        },
        Age: {
            type: DataTypes.INTEGER
        }
    });
    return Person;
};