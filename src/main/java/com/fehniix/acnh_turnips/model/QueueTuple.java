package com.fehniix.acnh_turnips.model;

import com.fehniix.acnh_turnips.Queue;

public class QueueTuple {
	public QueueMeta meta;
	public Queue queueInstance;

	public QueueTuple(QueueMeta meta, Queue queueInstance) {
		this.meta = meta;
		this.queueInstance = queueInstance;
	}
}
