package livekit.org.webrtc;

import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public class StatsReport {

    /* JADX INFO: renamed from: id */
    public final String f54468id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return AbstractC9306j0.m9891j(this.value, "]", sb2);
        }
    }

    public StatsReport(String str, String str2, double d10, Value[] valueArr) {
        this.f54468id = str;
        this.type = str2;
        this.timestamp = d10;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f54468id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i10 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i10 >= valueArr.length) {
                return sb2.toString();
            }
            sb2.append(valueArr[i10].toString());
            sb2.append(", ");
            i10++;
        }
    }
}
