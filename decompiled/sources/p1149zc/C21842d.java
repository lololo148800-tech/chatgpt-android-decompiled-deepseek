package p1149zc;

import ec.AbstractC13361c;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21842d extends AbstractC13361c {

    /* JADX INFO: renamed from: c */
    public final String f69308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21842d(String connection) {
        super(connection, null);
        AbstractC16544l.m18094g(connection, "connection");
        this.f69308c = connection;
    }

    @Override // ec.AbstractC13361c
    /* JADX INFO: renamed from: a */
    public final String mo14946a() {
        return this.f69308c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21842d) && AbstractC16544l.m18089b(this.f69308c, ((C21842d) obj).f69308c);
    }

    public final int hashCode() {
        return this.f69308c.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
