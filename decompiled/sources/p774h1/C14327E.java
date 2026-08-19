package p774h1;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8088f6;
import p759g1.C13800b;
import p759g1.C13803e;

/* JADX INFO: renamed from: h1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C14327E extends AbstractC14337O {

    /* JADX INFO: renamed from: c */
    public final List f44963c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f44964d;

    /* JADX INFO: renamed from: e */
    public final long f44965e;

    /* JADX INFO: renamed from: f */
    public final long f44966f;

    /* JADX INFO: renamed from: g */
    public final int f44967g;

    public C14327E(List list, ArrayList arrayList, long j10, long j11, int i10) {
        this.f44963c = list;
        this.f44964d = arrayList;
        this.f44965e = j10;
        this.f44966f = j11;
        this.f44967g = i10;
    }

    @Override // p774h1.AbstractC14337O
    /* JADX INFO: renamed from: b */
    public final Shader mo14804b(long j10) {
        long j11 = this.f44965e;
        float fM15333e = C13800b.m15306g(j11) == Float.POSITIVE_INFINITY ? C13803e.m15333e(j10) : C13800b.m15306g(j11);
        float fM15331c = C13800b.m15307h(j11) == Float.POSITIVE_INFINITY ? C13803e.m15331c(j10) : C13800b.m15307h(j11);
        long j12 = this.f44966f;
        return AbstractC14334L.m15629g(AbstractC8088f6.m8536b(fM15333e, fM15331c), AbstractC8088f6.m8536b(C13800b.m15306g(j12) == Float.POSITIVE_INFINITY ? C13803e.m15333e(j10) : C13800b.m15306g(j12), C13800b.m15307h(j12) == Float.POSITIVE_INFINITY ? C13803e.m15331c(j10) : C13800b.m15307h(j12)), this.f44963c, this.f44964d, this.f44967g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14327E)) {
            return false;
        }
        C14327E c14327e = (C14327E) obj;
        return this.f44963c.equals(c14327e.f44963c) && AbstractC16544l.m18089b(this.f44964d, c14327e.f44964d) && C13800b.m15303d(this.f44965e, c14327e.f44965e) && C13800b.m15303d(this.f44966f, c14327e.f44966f) && AbstractC14334L.m15644v(this.f44967g, c14327e.f44967g);
    }

    public final int hashCode() {
        int iHashCode = this.f44963c.hashCode() * 31;
        ArrayList arrayList = this.f44964d;
        return ((C13800b.m15308i(this.f44966f) + ((C13800b.m15308i(this.f44965e) + ((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31)) * 31)) * 31) + this.f44967g;
    }

    public final String toString() {
        String str;
        String str2;
        long j10 = this.f44965e;
        String str3 = "";
        if (AbstractC8088f6.m8537c(j10)) {
            str = "start=" + ((Object) C13800b.m15313n(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f44966f;
        if (AbstractC8088f6.m8537c(j11)) {
            str3 = "end=" + ((Object) C13800b.m15313n(j11)) + ", ";
        }
        StringBuilder sb2 = new StringBuilder("LinearGradient(colors=");
        sb2.append(this.f44963c);
        sb2.append(", stops=");
        sb2.append(this.f44964d);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append("tileMode=");
        int i10 = this.f44967g;
        if (AbstractC14334L.m15644v(i10, 0)) {
            str2 = "Clamp";
        } else if (AbstractC14334L.m15644v(i10, 1)) {
            str2 = "Repeated";
        } else if (AbstractC14334L.m15644v(i10, 2)) {
            str2 = "Mirror";
        } else {
            str2 = AbstractC14334L.m15644v(i10, 3) ? "Decal" : "Unknown";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
