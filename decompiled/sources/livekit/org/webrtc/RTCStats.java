package livekit.org.webrtc;

import java.util.Map;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public class RTCStats {

    /* JADX INFO: renamed from: id */
    private final String f54466id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
        this.type = str;
        this.f54466id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb2.append(obj);
                return;
            }
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb2.append('[');
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i10]);
        }
        sb2.append(']');
    }

    public static RTCStats create(long j10, String str, String str2, Map map) {
        return new RTCStats(j10, str, str2, map);
    }

    public String getId() {
        return this.f54466id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("{ timestampUs: ");
        sbM9893l.append(this.timestampUs);
        sbM9893l.append(", type: ");
        sbM9893l.append(this.type);
        sbM9893l.append(", id: ");
        sbM9893l.append(this.f54466id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sbM9893l.append(", ");
            sbM9893l.append(entry.getKey());
            sbM9893l.append(": ");
            appendValue(sbM9893l, entry.getValue());
        }
        sbM9893l.append(" }");
        return sbM9893l.toString();
    }
}
