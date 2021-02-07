package com.example.ordertrack

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class TrackActivity : AppCompatActivity() {
    var view_order_placed: View? = null
    var view_order_confirmed: View? = null
    var view_order_processed: View? = null
    var view_order_pickup: View? = null
    var con_divider: View? = null
    var ready_divider: View? = null
    var placed_divider: View? = null
    var img_orderconfirmed: ImageView? = null
    var orderprocessed: ImageView? = null
    var orderpickup: ImageView? = null
    var textorderpickup: TextView? = null
    var text_confirmed: TextView? = null
    var textorderprocessed: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_order_placed = findViewById(R.id.view_order_placed)
        view_order_confirmed = findViewById(R.id.view_order_confirmed)
        view_order_processed = findViewById(R.id.view_order_processed)
        view_order_pickup = findViewById(R.id.view_order_pickup)
        placed_divider = findViewById(R.id.placed_divider)
        con_divider = findViewById(R.id.con_divider)
        ready_divider = findViewById(R.id.ready_divider)
        textorderpickup = findViewById(R.id.textorderpickup)
        text_confirmed = findViewById(R.id.text_confirmed)
        textorderprocessed = findViewById(R.id.textorderprocessed)
        img_orderconfirmed = findViewById(R.id.img_orderconfirmed)
        orderprocessed = findViewById(R.id.orderprocessed)
        orderpickup = findViewById(R.id.orderpickup)
        val intent = intent
        val orderStatus = intent.getStringExtra("orderStatus")
        getOrderStatus(orderStatus)
    }

    private fun getOrderStatus(orderStatus: String?) {
        if (orderStatus == "0") {
            val alfa = 0.5.toFloat()
            setStatus(alfa)
        } else if (orderStatus == "1") {
            val alfa = 1.toFloat()
            setStatus1(alfa)
        } else if (orderStatus == "2") {
            val alfa = 1.toFloat()
            setStatus2(alfa)
        } else if (orderStatus == "3") {
            val alfa = 1.toFloat()
            setStatus3(alfa)
        }
    }

    private fun setStatus(alfa: Float) {
        val myf = 0.5.toFloat()
        view_order_placed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        view_order_confirmed!!.background = resources.getDrawable(R.drawable.shape_status_current)
        orderprocessed!!.alpha = alfa
        view_order_processed!!.background = resources.getDrawable(R.drawable.shape_status_current)
        con_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        placed_divider!!.alpha = alfa
        img_orderconfirmed!!.alpha = alfa
        placed_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        text_confirmed!!.alpha = alfa
        textorderprocessed!!.alpha = alfa
        view_order_pickup!!.background = resources.getDrawable(R.drawable.shape_status_current)
        ready_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        orderpickup!!.alpha = alfa
        textorderpickup!!.alpha = myf
    }

    private fun setStatus1(alfa: Float) {
        val myf = 0.5.toFloat()
        view_order_placed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        view_order_confirmed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        orderprocessed!!.alpha = myf
        view_order_processed!!.background = resources.getDrawable(R.drawable.shape_status_current)
        con_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        placed_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        img_orderconfirmed!!.alpha = alfa
        text_confirmed!!.alpha = alfa
        textorderprocessed!!.alpha = myf
        view_order_pickup!!.alpha = myf
        ready_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        orderpickup!!.alpha = myf
        view_order_pickup!!.background = resources.getDrawable(R.drawable.shape_status_current)
        textorderpickup!!.alpha = myf
    }

    private fun setStatus2(alfa: Float) {
        val myf = 0.5.toFloat()
        view_order_placed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        view_order_confirmed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        orderprocessed!!.alpha = alfa
        view_order_processed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        con_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        placed_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        img_orderconfirmed!!.alpha = alfa
        text_confirmed!!.alpha = alfa
        textorderprocessed!!.alpha = alfa
        view_order_pickup!!.background = resources.getDrawable(R.drawable.shape_status_current)
        ready_divider!!.background = resources.getDrawable(R.drawable.shape_status_current)
        textorderpickup!!.alpha = myf
        orderpickup!!.alpha = myf
    }

    private fun setStatus3(alfa: Float) {
        view_order_placed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        view_order_confirmed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        orderprocessed!!.alpha = alfa
        view_order_processed!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        con_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        img_orderconfirmed!!.alpha = alfa
        placed_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        text_confirmed!!.alpha = alfa
        textorderprocessed!!.alpha = alfa
        view_order_pickup!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        ready_divider!!.background = resources.getDrawable(R.drawable.shape_status_completed)
        textorderpickup!!.alpha = alfa
        orderpickup!!.alpha = alfa
    }
}