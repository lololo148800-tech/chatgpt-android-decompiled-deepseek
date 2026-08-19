package com.openai.feature.gizmoshome.impl.details;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21897B1;
import p1155zi.C21921H1;
import p1155zi.C22011h0;
import p1155zi.InterfaceC21925I1;
import p706df.C13087g;
import p706df.C13104x;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ldf/x;", "invoke", "(Ldf/x;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$loadMore$3$1$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ SnorlaxHomeViewModelImpl f38348Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f38349Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f38350o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21897B1 f38351p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$loadMore$3$1$2(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, List list, boolean z6, C21897B1 c21897b1) {
        super(1);
        this.f38348Y = snorlaxHomeViewModelImpl;
        this.f38349Z = list;
        this.f38350o0 = z6;
        this.f38351p0 = c21897b1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:4:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ?? r10;
        C21897B1 c21897b1;
        String str;
        InterfaceC21925I1 c21921h1;
        C13104x setState = (C13104x) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        boolean z6 = ((C13104x) this.f38348Y.f40343c.getValue()).f41616d;
        ?? r6 = this.f38349Z;
        boolean z10 = this.f38350o0;
        if (z6) {
            r10 = r6;
        } else {
            List list = setState.f41614b;
            if (z10) {
                int size = r6.size();
                int size2 = list.size();
                if (size > size2) {
                    size = size2;
                }
                boolean zEquals = r6.equals(list.subList(0, size));
                r10 = list;
                if (!zEquals) {
                    r10 = r6;
                }
            } else {
                ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0((Iterable) r6, list);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM19361k0) {
                    if (hashSet.add(new C22011h0(((C13087g) obj2).f41579a))) {
                        arrayList.add(obj2);
                    }
                }
                r10 = arrayList;
            }
        }
        if (z10) {
            InterfaceC21925I1 interfaceC21925I1 = setState.f41615c;
            if (interfaceC21925I1 instanceof C21921H1) {
                c21921h1 = interfaceC21925I1;
            } else {
                c21897b1 = this.f38351p0;
                if (c21897b1 != null) {
                    str = c21897b1.f69432b;
                } else {
                    str = null;
                }
                c21921h1 = new C21921H1(str);
            }
        } else {
            c21897b1 = this.f38351p0;
            if (c21897b1 != null) {
                str = c21897b1.f69432b;
            } else {
                str = null;
            }
            c21921h1 = new C21921H1(str);
        }
        return C13104x.m14805e(setState, null, r10, c21921h1, false, null, 113);
    }
}
