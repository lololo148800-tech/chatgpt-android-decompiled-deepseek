package p544W9;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import be.C11345b;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15375i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import ni.C17632f;
import ni.C17634h;
import p025An.AbstractC0575H;
import p035B7.C0846c;
import p049Bm.InterfaceC1426a;
import p059C5.C1601s;
import p092Dc.C1996m;
import p092Dc.C1999p;
import p092Dc.C2001r;
import p1113xn.AbstractC21322p;
import p1143z4.C21793w;
import p1155zi.C21936L0;
import p1155zi.C21966U1;
import p1155zi.C22011h0;
import p192He.C3289a;
import p192He.C3294f;
import p267Ke.C4640b;
import p267Ke.C4641c;
import p318Mh.AbstractC5364G0;
import p318Mh.AbstractC5395e;
import p318Mh.C5431w;
import p337Nd.C5709b;
import p337Nd.C5710c;
import p337Nd.C5711d;
import p337Nd.InterfaceC5708a;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8160o6;
import p537W0.C8410b;
import p571X9.AbstractC9227W;
import p594Y9.AbstractC9834X3;
import p817j$.util.concurrent.ConcurrentHashMap;
import p857kl.C16472t;
import p857kl.C16473u;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17691y;
import p914o3.AbstractC17814e;

/* JADX INFO: renamed from: W9.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8645h4 {
    /* JADX INFO: renamed from: a */
    public static final void m9312a(C21793w c21793w, AbstractC5395e destination, boolean z6, C8410b c8410b) {
        AbstractC16544l.m18094g(c21793w, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        AbstractC5364G0.m5887b(c21793w, destination, z6, new C8410b(new C5711d(c8410b, 0), true, 639064315));
    }

    /* JADX INFO: renamed from: b */
    public static final List m9313b(String str) {
        int i10;
        C17309l c17309l;
        C17309l c17309l2;
        C17689w c17689w = C17689w.f56480Y;
        if (str == null) {
            return c17689w;
        }
        InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C1601s(24));
        for (int i11 = 0; i11 <= AbstractC21322p.m21674H(str); i11 = i10) {
            InterfaceC17306i interfaceC17306iM9799b2 = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C1601s(25));
            Integer numValueOf = null;
            i10 = i11;
            while (true) {
                if (i10 > AbstractC21322p.m21674H(str)) {
                    ((ArrayList) interfaceC17306iM9799b.getValue()).add(new C16472t(m9316e(i11, numValueOf != null ? numValueOf.intValue() : i10, str), interfaceC17306iM9799b2.isInitialized() ? (List) interfaceC17306iM9799b2.getValue() : c17689w));
                    break;
                }
                char cCharAt = str.charAt(i10);
                if (cCharAt == ',') {
                    ((ArrayList) interfaceC17306iM9799b.getValue()).add(new C16472t(m9316e(i11, numValueOf != null ? numValueOf.intValue() : i10, str), interfaceC17306iM9799b2.isInitialized() ? (List) interfaceC17306iM9799b2.getValue() : c17689w));
                    i10++;
                    break;
                }
                if (cCharAt == ';') {
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    int i12 = i10 + 1;
                    int i13 = i12;
                    while (true) {
                        if (i13 <= AbstractC21322p.m21674H(str)) {
                            char cCharAt2 = str.charAt(i13);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                m9314c(interfaceC17306iM9799b2, str, i12, i13, "");
                            } else {
                                if (cCharAt2 == '=') {
                                    int i14 = i13 + 1;
                                    if (str.length() == i14) {
                                        c17309l2 = new C17309l(Integer.valueOf(i14), "");
                                    } else {
                                        char c9 = '\"';
                                        if (str.charAt(i14) != '\"') {
                                            int i15 = i14;
                                            while (true) {
                                                if (i15 > AbstractC21322p.m21674H(str)) {
                                                    c17309l = new C17309l(Integer.valueOf(i15), m9316e(i14, i15, str));
                                                    break;
                                                }
                                                char cCharAt3 = str.charAt(i15);
                                                if (cCharAt3 == ',' || cCharAt3 == ';') {
                                                    c17309l = new C17309l(Integer.valueOf(i15), m9316e(i14, i15, str));
                                                    break;
                                                }
                                                i15++;
                                            }
                                        } else {
                                            int i16 = i13 + 2;
                                            StringBuilder sb2 = new StringBuilder();
                                            while (true) {
                                                if (i16 > AbstractC21322p.m21674H(str)) {
                                                    Integer numValueOf2 = Integer.valueOf(i16);
                                                    String string = sb2.toString();
                                                    AbstractC16544l.m18093f(string, "toString(...)");
                                                    c17309l = new C17309l(numValueOf2, Separators.DOUBLE_QUOTE.concat(string));
                                                    break;
                                                }
                                                char cCharAt4 = str.charAt(i16);
                                                if (cCharAt4 == c9) {
                                                    int i17 = i16 + 1;
                                                    int i18 = i17;
                                                    while (i18 < str.length() && str.charAt(i18) == ' ') {
                                                        i18++;
                                                    }
                                                    if (i18 == str.length() || str.charAt(i18) == ';') {
                                                        c17309l = new C17309l(Integer.valueOf(i17), sb2.toString());
                                                        break;
                                                    }
                                                }
                                                if (cCharAt4 != '\\' || i16 >= AbstractC21322p.m21674H(str) - 2) {
                                                    sb2.append(cCharAt4);
                                                    i16++;
                                                } else {
                                                    sb2.append(str.charAt(i16 + 1));
                                                    i16 += 2;
                                                }
                                                c9 = '\"';
                                            }
                                        }
                                        c17309l2 = c17309l;
                                    }
                                    int iIntValue = ((Number) c17309l2.f55136Y).intValue();
                                    m9314c(interfaceC17306iM9799b2, str, i12, i13, (String) c17309l2.f55137Z);
                                    i10 = iIntValue;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            m9314c(interfaceC17306iM9799b2, str, i12, i13, "");
                        }
                        i10 = i13;
                        break;
                    }
                }
                i10++;
            }
        }
        return interfaceC17306iM9799b.isInitialized() ? (List) interfaceC17306iM9799b.getValue() : c17689w;
    }

    /* JADX INFO: renamed from: c */
    public static final void m9314c(InterfaceC17306i interfaceC17306i, String str, int i10, int i11, String str2) {
        String strM9316e = m9316e(i10, i11, str);
        if (strM9316e.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC17306i.getValue()).add(new C16473u(strM9316e, str2));
    }

    /* JADX INFO: renamed from: d */
    public static final C2001r m9315d(Bundle bundle, C6021p c6021p, int i10) {
        Object next;
        Object objM19235b;
        Object next2;
        c6021p.m6524S(-501767952);
        Bundle arguments = (i10 & 1) != 0 ? new Bundle() : bundle;
        C5431w.f17746g.getClass();
        C22011h0 c22011h0 = (C22011h0) C5431w.f17747h.m5891b(arguments);
        C2001r c2001r = null;
        String str = c22011h0 != null ? c22011h0.f69652a : null;
        Object[] objArr = {str != null ? new C22011h0(str) : null};
        C5709b c5709b = C5709b.f18497Y;
        c6021p.m6524S(-1755494594);
        boolean zM6542f = c6021p.m6542f(str != null ? new C22011h0(str) : null);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C0846c(str, 5);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        String conversationId = ((C22011h0) AbstractC9834X3.m10481d(objArr, c5709b, null, (InterfaceC1426a) objM6514H, c6021p, 48, 4)).f69652a;
        AbstractC11105n lifecycle = ((InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a)).mo7809i();
        c6021p.m6524S(617413469);
        Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof C1996m));
        if (next != null) {
            objM19235b = (C1996m) next;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(C1996m.class);
            c6021p.m6553p(false);
        }
        C1996m c1996m = (C1996m) objM19235b;
        InterfaceC5708a interfaceC5708a = c1996m != null ? (InterfaceC5708a) c1996m.f5980w.get() : null;
        if (interfaceC5708a != null) {
            C3294f c3294f = (C3294f) interfaceC5708a;
            synchronized (c3294f) {
                try {
                    AbstractC16544l.m18094g(lifecycle, "lifecycle");
                    AbstractC16544l.m18094g(conversationId, "conversationId");
                    AbstractC16544l.m18094g(arguments, "arguments");
                    ConcurrentHashMap concurrentHashMap = c3294f.f10049d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        C2001r c2001r2 = (C2001r) entry.getKey();
                        AbstractC16544l.m18092e(c2001r2, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings");
                        if (((List) ((C11345b) c2001r2.f6107i.get()).f34300b.getValue()).contains(new C22011h0(conversationId))) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    if (setKeySet.size() > 1) {
                        AbstractC15152P0.m16328b(EnumC15375i1.ERROR);
                    }
                    C2001r c2001r3 = (C2001r) AbstractC17680n.m19342R(setKeySet);
                    if (c2001r3 == null) {
                        C5431w.f17746g.getClass();
                        C21966U1 c21966u1 = (C21966U1) C5431w.f17750k.m5891b(arguments);
                        String str2 = c21966u1 != null ? c21966u1.f69541a : null;
                        C21936L0 c21936l0 = (C21936L0) C5431w.f17751l.m5891b(arguments);
                        String str3 = c21936l0 != null ? c21936l0.f69488a : null;
                        String str4 = (String) C5431w.f17752m.m5891b(arguments);
                        C22011h0 c22011h1 = (C22011h0) C5431w.f17749j.m5891b(arguments);
                        C5710c c5710c = new C5710c(conversationId, c22011h1 != null ? c22011h1.f69652a : null, str2, str3, str4);
                        C17634h c17634h = new C17634h(c3294f.f10047b);
                        C1999p c1999p = c3294f.f10046a;
                        C2001r c2001r4 = new C2001r(c1999p.f6084a, c1999p.f6085b, c1999p.f6086c, c5710c, c17634h);
                        C4641c c4641c = (C4641c) c2001r4.f6119u.get();
                        if (c4641c.f15103c.getAndSet(true)) {
                            throw new IllegalArgumentException("Initialize may only be called once!");
                        }
                        AbstractC0575H.m1156D(c4641c.f15102b, null, null, new C4640b(c4641c, null), 3);
                        c2001r3 = c2001r4;
                    } else {
                        ConcurrentHashMap concurrentHashMap2 = c3294f.f10049d;
                        AbstractC16544l.m18094g(concurrentHashMap2, "<this>");
                        Iterator it2 = concurrentHashMap2.entrySet().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!((Set) ((Map.Entry) next2).getValue()).contains(lifecycle));
                        Map.Entry entry2 = (Map.Entry) next2;
                        C2001r c2001r5 = entry2 != null ? (C2001r) entry2.getKey() : null;
                        if (c2001r5 != null) {
                            c2001r = c2001r5;
                        }
                    }
                    if (lifecycle.mo7807b() == EnumC11104m.f33474Y) {
                        AbstractC8160o6.m8731f(c3294f.f10048c, "Created a conversation component but discarding it because caller is destroyed.", null, null, 6);
                    } else {
                        AbstractC8160o6.m8728c(c3294f.f10048c, "Creating conversation component for " + C22011h0.m22343a(conversationId), null, null, 6);
                        ConcurrentHashMap concurrentHashMap3 = c3294f.f10049d;
                        Set set = (Set) concurrentHashMap3.get(c2001r3);
                        if (set == null) {
                            set = C17691y.f56482Y;
                        }
                        concurrentHashMap3.put(c2001r3, AbstractC17665J.m19267g(set, lifecycle));
                    }
                    lifecycle.mo7806a(new C3289a(c3294f, c2001r3, lifecycle));
                    c2001r = c2001r3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        c6021p.m6553p(false);
        return c2001r;
    }

    /* JADX INFO: renamed from: e */
    public static final String m9316e(int i10, int i11, String str) {
        String strSubstring = str.substring(i10, i11);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return AbstractC21322p.m21711s0(strSubstring).toString();
    }
}
