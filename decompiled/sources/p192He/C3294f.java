package p192He;

import be.C11345b;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import ni.C17635i;
import p025An.C0564B0;
import p092Dc.C1999p;
import p092Dc.C2001r;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p195Hh.C3430e;
import p337Nd.InterfaceC5708a;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.C17691y;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: He.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3294f implements InterfaceC5708a {

    /* JADX INFO: renamed from: f */
    public static final long f10045f;

    /* JADX INFO: renamed from: a */
    public final C1999p f10046a;

    /* JADX INFO: renamed from: b */
    public final C17627a f10047b;

    /* JADX INFO: renamed from: c */
    public final C3430e f10048c = AbstractC8168p6.m8749b("ConversationComponentManager", null);

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f10049d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public C0564B0 f10050e;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f10045f = AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS);
    }

    public C3294f(C1999p c1999p, C17627a c17627a) {
        this.f10046a = c1999p;
        this.f10047b = c17627a;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4163a(C3294f c3294f, C2001r c2001r) {
        Collection collection = (Set) c3294f.f10049d.get(c2001r);
        if (collection == null) {
            collection = C17691y.f56482Y;
        }
        return !collection.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m4164b(C3294f c3294f, C2001r c2001r, AbstractC19687c abstractC19687c) {
        C3290b c3290b;
        C3294f c3294f2;
        C2001r c2001r2;
        if (abstractC19687c instanceof C3290b) {
            c3290b = (C3290b) abstractC19687c;
            int i10 = c3290b.f10034q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3290b.f10034q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3290b = new C3290b(c3294f, abstractC19687c);
            }
        } else {
            c3290b = new C3290b(c3294f, abstractC19687c);
        }
        Object obj = c3290b.f10032o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3290b.f10034q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c2001r = c3290b.f10031Z;
                c3294f = c3290b.f10030Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2001r2 = c3290b.f10031Z;
                c3294f2 = c3290b.f10030Y;
                AbstractC9233X.m9807c(obj);
            }
            c3294f2.getClass();
            AbstractC16544l.m18092e(c2001r2, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings");
            List list = (List) ((C11345b) c2001r2.f6107i.get()).f34300b.getValue();
            AbstractC8160o6.m8728c(c3294f2.f10048c, "Removing conversation component for " + list, null, null, 6);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC16544l.m18092e(c2001r, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings");
        c3290b.f10030Y = c3294f;
        c3290b.f10031Z = c2001r;
        c3290b.f10034q0 = 1;
        if (c2001r.f6099a.m19232a(c3290b) == enumC19250a) {
            return enumC19250a;
        }
        c3294f.getClass();
        AbstractC16544l.m18092e(c2001r, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings");
        C17635i c17635i = (C17635i) c2001r.f6120v.get();
        c3290b.f10030Y = c3294f;
        c3290b.f10031Z = c2001r;
        c3290b.f10034q0 = 2;
        if (c17635i.m19236a(c3290b) == enumC19250a) {
            return enumC19250a;
        }
        C2001r c2001r3 = c2001r;
        c3294f2 = c3294f;
        c2001r2 = c2001r3;
        c3294f2.getClass();
        AbstractC16544l.m18092e(c2001r2, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings");
        List list2 = (List) ((C11345b) c2001r2.f6107i.get()).f34300b.getValue();
        AbstractC8160o6.m8728c(c3294f2.f10048c, "Removing conversation component for " + list2, null, null, 6);
        return C17296C.f55119a;
    }
}
