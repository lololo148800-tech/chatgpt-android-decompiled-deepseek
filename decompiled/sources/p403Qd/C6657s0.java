package p403Qd;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p1155zi.C21984a1;

/* JADX INFO: renamed from: Qd.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6657s0 {

    /* JADX INFO: renamed from: a */
    public final int f21422a;

    /* JADX INFO: renamed from: b */
    public final String f21423b;

    /* JADX INFO: renamed from: c */
    public final String f21424c;

    /* JADX INFO: renamed from: d */
    public final boolean f21425d;

    /* JADX INFO: renamed from: e */
    public final long f21426e;

    /* JADX INFO: renamed from: f */
    public final Map f21427f;

    /* JADX INFO: renamed from: g */
    public final Map f21428g;

    public C6657s0(int i10, String str, String initialMessageId, boolean z6, long j10, Map messageIdsByParentId, Map updateTimeByMessage) {
        AbstractC16544l.m18094g(initialMessageId, "initialMessageId");
        AbstractC16544l.m18094g(messageIdsByParentId, "messageIdsByParentId");
        AbstractC16544l.m18094g(updateTimeByMessage, "updateTimeByMessage");
        this.f21422a = i10;
        this.f21423b = str;
        this.f21424c = initialMessageId;
        this.f21425d = z6;
        this.f21426e = j10;
        this.f21427f = messageIdsByParentId;
        this.f21428g = updateTimeByMessage;
    }

    /* JADX INFO: renamed from: a */
    public static C6657s0 m7169a(C6657s0 c6657s0, Map map, Map map2, int i10) {
        int i11 = c6657s0.f21422a;
        String str = c6657s0.f21423b;
        String initialMessageId = c6657s0.f21424c;
        boolean z6 = c6657s0.f21425d;
        long j10 = c6657s0.f21426e;
        if ((i10 & 32) != 0) {
            map = c6657s0.f21427f;
        }
        Map messageIdsByParentId = map;
        if ((i10 & 64) != 0) {
            map2 = c6657s0.f21428g;
        }
        Map updateTimeByMessage = map2;
        c6657s0.getClass();
        AbstractC16544l.m18094g(initialMessageId, "initialMessageId");
        AbstractC16544l.m18094g(messageIdsByParentId, "messageIdsByParentId");
        AbstractC16544l.m18094g(updateTimeByMessage, "updateTimeByMessage");
        return new C6657s0(i11, str, initialMessageId, z6, j10, messageIdsByParentId, updateTimeByMessage);
    }

    /* JADX INFO: renamed from: b */
    public final String m7170b() {
        Object obj;
        Iterator it = this.f21427f.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int size = ((Set) ((Map.Entry) next).getValue()).size();
                do {
                    Object next2 = it.next();
                    int size2 = ((Set) ((Map.Entry) next2).getValue()).size();
                    if (size < size2) {
                        next = next2;
                        size = size2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return (entry == null || ((Set) entry.getValue()).size() <= 1) ? this.f21424c : ((C21984a1) entry.getKey()).f69607Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6657s0)) {
            return false;
        }
        C6657s0 c6657s0 = (C6657s0) obj;
        return this.f21422a == c6657s0.f21422a && AbstractC16544l.m18089b(this.f21423b, c6657s0.f21423b) && AbstractC16544l.m18089b(this.f21424c, c6657s0.f21424c) && this.f21425d == c6657s0.f21425d && this.f21426e == c6657s0.f21426e && AbstractC16544l.m18089b(this.f21427f, c6657s0.f21427f) && AbstractC16544l.m18089b(this.f21428g, c6657s0.f21428g);
    }

    public final int hashCode() {
        int i10 = this.f21422a * 31;
        String str = this.f21423b;
        int iM527p = AbstractC0168G.m527p((i10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f21424c);
        int i11 = this.f21425d ? 1231 : 1237;
        long j10 = this.f21426e;
        return this.f21428g.hashCode() + AbstractC20734X.m21250u((((iM527p + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f21427f);
    }

    public final String toString() {
        return "█";
    }
}
