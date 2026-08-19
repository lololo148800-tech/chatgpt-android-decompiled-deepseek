package p754fl;

import il.C15038c;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0566C0;
import p1111xl.C21296a;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8699q4;
import p857kl.C16438E;
import p857kl.C16447N;
import p857kl.C16477y;
import p857kl.InterfaceC16437D;
import p909nm.AbstractC17680n;
import sl.C19666a;
import sl.C19675j;

/* JADX INFO: renamed from: fl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13693c implements InterfaceC16437D {

    /* JADX INFO: renamed from: a */
    public final C16447N f43195a = new C16447N();

    /* JADX INFO: renamed from: b */
    public C16438E f43196b = C16438E.f50984b;

    /* JADX INFO: renamed from: c */
    public final C16477y f43197c = new C16477y();

    /* JADX INFO: renamed from: d */
    public Object f43198d = C15038c.f46757a;

    /* JADX INFO: renamed from: e */
    public C0566C0 f43199e = AbstractC0575H.m1176e();

    /* JADX INFO: renamed from: f */
    public final C19675j f43200f = new C19675j();

    @Override // p857kl.InterfaceC16437D
    /* JADX INFO: renamed from: a */
    public final C16477y mo9567a() {
        return this.f43197c;
    }

    /* JADX INFO: renamed from: b */
    public final void m15167b(C21296a c21296a) {
        C19675j c19675j = this.f43200f;
        if (c21296a != null) {
            c19675j.m20652f(AbstractC13698h.f43228a, c21296a);
            return;
        }
        C19666a key = AbstractC13698h.f43228a;
        c19675j.getClass();
        AbstractC16544l.m18094g(key, "key");
        c19675j.m20650d().remove(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m15168c(C16438E c16438e) {
        AbstractC16544l.m18094g(c16438e, "<set-?>");
        this.f43196b = c16438e;
    }

    /* JADX INFO: renamed from: d */
    public final void m15169d(C13693c builder) {
        AbstractC16544l.m18094g(builder, "builder");
        this.f43199e = builder.f43199e;
        this.f43196b = builder.f43196b;
        this.f43198d = builder.f43198d;
        C19666a c19666a = AbstractC13698h.f43228a;
        C19675j other = builder.f43200f;
        m15167b((C21296a) other.m20651e(c19666a));
        C16447N c16447n = builder.f43195a;
        C16447N c16447n2 = this.f43195a;
        AbstractC8699q4.m9404d(c16447n2, c16447n);
        List list = c16447n2.f51025h;
        AbstractC16544l.m18094g(list, "<set-?>");
        c16447n2.f51025h = list;
        AbstractC8142m4.m8673a(this.f43197c, builder.f43197c);
        C19675j c19675j = this.f43200f;
        AbstractC16544l.m18094g(c19675j, "<this>");
        AbstractC16544l.m18094g(other, "other");
        for (C19666a c19666a2 : AbstractC17680n.m19322C0(other.m20650d().keySet())) {
            AbstractC16544l.m18092e(c19666a2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            c19675j.m20652f(c19666a2, other.m20649c(c19666a2));
        }
    }
}
