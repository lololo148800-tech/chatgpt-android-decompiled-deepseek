package af;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: af.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10571a0 {

    /* JADX INFO: renamed from: a */
    public final String f31386a;

    /* JADX INFO: renamed from: b */
    public final C10575c0 f31387b;

    /* JADX INFO: renamed from: c */
    public final String f31388c;

    public C10571a0(String query, C10575c0 c10575c0, String id2) {
        AbstractC16544l.m18094g(query, "query");
        AbstractC16544l.m18094g(id2, "id");
        this.f31386a = query;
        this.f31387b = c10575c0;
        this.f31388c = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10571a0)) {
            return false;
        }
        C10571a0 c10571a0 = (C10571a0) obj;
        return AbstractC16544l.m18089b(this.f31386a, c10571a0.f31386a) && AbstractC16544l.m18089b(this.f31387b, c10571a0.f31387b) && AbstractC16544l.m18089b(this.f31388c, c10571a0.f31388c);
    }

    public final int hashCode() {
        return this.f31388c.hashCode() + ((this.f31387b.hashCode() + (this.f31386a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C10571a0(String str, C10575c0 c10575c0) {
        this(str, c10575c0, AbstractC3794B0.m4498w("toString(...)"));
    }
}
