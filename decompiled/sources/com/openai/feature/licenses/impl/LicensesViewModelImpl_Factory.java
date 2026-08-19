package com.openai.feature.licenses.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import nf.C17608g;
import nf.C17609h;
import p092Dc.C1992i;
import p248Jk.InterfaceC4473d;
import p386Pk.C6449a;
import p386Pk.C6450b;
import p386Pk.C6452d;
import p386Pk.C6453e;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/licenses/impl/LicensesViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/licenses/impl/LicensesViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LicensesViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final Companion f38480b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C1992i f38481a;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/licenses/impl/LicensesViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public LicensesViewModelImpl_Factory(C1992i licensee) {
        AbstractC16544l.m18094g(licensee, "licensee");
        this.f38481a = licensee;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        String str;
        String str2;
        this.f38481a.get();
        C6450b c6450b = C6450b.f20928a;
        f38480b.getClass();
        List<C6449a> list = C6450b.f20929b;
        ArrayList arrayList = new ArrayList();
        for (C6449a c6449a : list) {
            String str3 = c6449a.f20924d;
            C17608g c17608g = null;
            if (str3 != null) {
                List list2 = c6449a.f20925e;
                C6452d c6452d = (C6452d) AbstractC17680n.m19343S(list2);
                List list3 = c6449a.f20927g;
                if (c6452d != null) {
                    str = c6452d.f20932b;
                } else {
                    C6453e c6453e = (C6453e) AbstractC17680n.m19343S(list3);
                    str = c6453e != null ? c6453e.f20934a : null;
                    if (str != null) {
                    }
                }
                C6452d c6452d2 = (C6452d) AbstractC17680n.m19343S(list2);
                if (c6452d2 != null) {
                    str2 = c6452d2.f20933c;
                } else {
                    C6453e c6453e2 = (C6453e) AbstractC17680n.m19343S(list3);
                    String str4 = c6453e2 != null ? c6453e2.f20935b : null;
                    if (str4 != null) {
                        str2 = str4;
                    }
                }
                c17608g = new C17608g(c6449a.f20921a + ":" + c6449a.f20922b, str3, str, str2);
            }
            if (c17608g != null) {
                arrayList.add(c17608g);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C17608g) obj).f56362a)) {
                arrayList2.add(obj);
            }
        }
        return new LicensesViewModelImpl(new C17609h(arrayList2));
    }
}
