package com.openai.feature.messages.impl;

import android.gov.nist.core.Separators;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p1053v3.p1054lN.IGDwkYw;
import p1139z0.C21585H;
import p117Eb.C2391u;
import p204I1.C3587c;
import p204I1.C3590f;
import p243Jf.C4331a;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p658b5.C11248s;
import p690cp.AbstractC12935u;
import p794hp.C14883a;
import p794hp.C14884b;
import p794hp.C14885c;
import p817j$.lang.Iterable$EL;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p817j$.util.function.Consumer$CC;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"impl_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class MessagesViewModelImplKt {

    /* JADX INFO: renamed from: a */
    public static final Map f38638a = AbstractC0168G.m535x("rating", "thumbsDown");

    /* JADX INFO: renamed from: a */
    public static final String m14306a(AbstractC7343b0 abstractC7343b0) {
        final int i10 = 1;
        final int i11 = 0;
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (abstractC7343b0 instanceof C7326L) {
            return ((C7326L) abstractC7343b0).f23233c;
        }
        if (!(abstractC7343b0 instanceof C7320F)) {
            if (abstractC7343b0 instanceof C7323I) {
                List listM7779c = ((C7323I) abstractC7343b0).m7779c();
                ArrayList arrayList = new ArrayList();
                Iterator it = listM7779c.iterator();
                while (it.hasNext()) {
                    String strM14306a = m14306a((AbstractC7343b0) it.next());
                    if (strM14306a != null) {
                        arrayList.add(strM14306a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return AbstractC17680n.m19349Y(arrayList, Separators.RETURN, null, null, 0, null, null, 62);
                }
            }
            return null;
        }
        AbstractC12935u abstractC12935uM7778d = ((C7320F) abstractC7343b0).m7778d();
        C11248s c11248s = new C11248s(22, false);
        Object[] objArr = {"http", "https", IGDwkYw.nSBONRgspQR, "data"};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i12 = 0; i12 < 4; i12++) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        new HashSet(DesugarCollections.unmodifiableList(arrayList2));
        c11248s.f34081Z = new ArrayList();
        c11248s.f34082o0 = new ArrayList();
        C15358g1 c15358g1 = new C15358g1();
        c15358g1.f47945Y = new ArrayList((ArrayList) c11248s.f34081Z);
        ArrayList arrayList3 = (ArrayList) c11248s.f34082o0;
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + 1);
        c15358g1.f47946Z = arrayList4;
        arrayList4.addAll(arrayList3);
        arrayList4.add(new C14884b());
        StringBuilder sb2 = new StringBuilder();
        C21585H c21585h = (C21585H) new C2391u(c15358g1, new C14885c(sb2)).f7431p0;
        Iterable$EL.forEach((ArrayList) c21585h.f68344Z, new Consumer() { // from class: ap.a
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m17405p(Object obj2) {
                C14883a c14883a = (C14883a) obj2;
                switch (i11) {
                    case 0:
                        c14883a.getClass();
                        break;
                    default:
                        c14883a.getClass();
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i13 = i11;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        C14883a c14883a = (C14883a) ((HashMap) c21585h.f68345o0).get(abstractC12935uM7778d.getClass());
        if (c14883a != null) {
            abstractC12935uM7778d.mo14588a(c14883a);
        }
        Iterable$EL.forEach((ArrayList) c21585h.f68344Z, new Consumer() { // from class: ap.a
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m17405p(Object obj2) {
                C14883a c14883a2 = (C14883a) obj2;
                switch (i10) {
                    case 0:
                        c14883a2.getClass();
                        break;
                    default:
                        c14883a2.getClass();
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i13 = i10;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "render(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static final C3590f m14307b(AbstractC7343b0 abstractC7343b0) {
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (abstractC7343b0 instanceof C7326L) {
            return new C3590f(6, ((C7326L) abstractC7343b0).f23233c, null);
        }
        if (abstractC7343b0 instanceof C7320F) {
            AbstractC12935u abstractC12935uM7778d = ((C7320F) abstractC7343b0).m7778d();
            C4331a c4331a = new C4331a(0);
            abstractC12935uM7778d.mo14588a(c4331a);
            return ((C3587c) c4331a.f14113Z).m4297i();
        }
        if (!(abstractC7343b0 instanceof C7323I)) {
            return null;
        }
        List listM7779c = ((C7323I) abstractC7343b0).m7779c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM7779c.iterator();
        while (it.hasNext()) {
            C3590f c3590fM14307b = m14307b((AbstractC7343b0) it.next());
            if (c3590fM14307b != null) {
                arrayList.add(c3590fM14307b);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3590f(6, AbstractC17680n.m19349Y(arrayList, Separators.RETURN, null, null, 0, null, null, 62), null);
    }
}
