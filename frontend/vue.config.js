module.exports = {
    devServer: {
        historyApiFallback: true,
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:8080'
            }
        },
        hot: true,
        overlay: true
    },
    transpileDependencies: [],
    configureWebpack: {
        plugins: []
    }
}