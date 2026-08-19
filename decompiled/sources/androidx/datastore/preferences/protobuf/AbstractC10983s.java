package androidx.datastore.preferences.protobuf;

import p025An.C0644w;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10983s implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC10987u f33094Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC10987u f33095Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f33096o0 = false;

    public AbstractC10983s(AbstractC10987u abstractC10987u) {
        this.f33094Y = abstractC10987u;
        this.f33095Z = (AbstractC10987u) abstractC10987u.mo7129d(4);
    }

    /* JADX INFO: renamed from: d */
    public static void m11710d(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2) {
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        c10944x.m11515a(abstractC10987u.getClass()).mo11499g(abstractC10987u, abstractC10987u2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC10987u m11711a() {
        AbstractC10987u abstractC10987uM11712b = m11712b();
        if (abstractC10987uM11712b.m11718g()) {
            return abstractC10987uM11712b;
        }
        throw new C0644w(13);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC10987u m11712b() {
        if (this.f33096o0) {
            return this.f33095Z;
        }
        AbstractC10987u abstractC10987u = this.f33095Z;
        abstractC10987u.getClass();
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        c10944x.m11515a(abstractC10987u.getClass()).mo11493a(abstractC10987u);
        this.f33096o0 = true;
        return this.f33095Z;
    }

    /* JADX INFO: renamed from: c */
    public final void m11713c() {
        if (this.f33096o0) {
            AbstractC10987u abstractC10987u = (AbstractC10987u) this.f33095Z.mo7129d(4);
            m11710d(abstractC10987u, this.f33095Z);
            this.f33095Z = abstractC10987u;
            this.f33096o0 = false;
        }
    }

    public final Object clone() {
        AbstractC10983s abstractC10983s = (AbstractC10983s) this.f33094Y.mo7129d(5);
        AbstractC10987u abstractC10987uM11712b = m11712b();
        abstractC10983s.m11713c();
        m11710d(abstractC10983s.f33095Z, abstractC10987uM11712b);
        return abstractC10983s;
    }
}
