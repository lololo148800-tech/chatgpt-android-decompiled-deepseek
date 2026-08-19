package p917o6;

import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p049Bm.InterfaceC1436k;
import p1006s6.C19451a;
import p523V9.AbstractC7849B0;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9154J3;
import p784hb.C14438g;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: o6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C17859l extends AbstractC17865r {

    /* JADX INFO: renamed from: a */
    public final String f56947a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9154J3 f56948b;

    /* JADX INFO: renamed from: c */
    public final C17689w f56949c;

    /* JADX INFO: renamed from: d */
    public final List f56950d;

    /* JADX INFO: renamed from: e */
    public final List f56951e;

    public C17859l(String str, AbstractC9154J3 type, C17689w condition, List arguments, List selections) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(condition, "condition");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(selections, "selections");
        this.f56947a = str;
        this.f56948b = type;
        this.f56949c = condition;
        this.f56950d = arguments;
        this.f56951e = selections;
    }

    /* JADX INFO: renamed from: a */
    public final Map m19599a(C14438g c14438g, InterfaceC1436k interfaceC1436k) {
        List list = this.f56950d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) interfaceC1436k.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList<C17858k> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C17844L c17844l = ((C17858k) obj2).f56946b;
            arrayList2.add(obj2);
        }
        if (arrayList2.isEmpty()) {
            return C17690x.f56481Y;
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (C17858k c17858k : arrayList2) {
            linkedHashMap.put(c17858k.f56945a.f15034Z, c17858k.f56946b.f56901a);
        }
        Object objM9678d = AbstractC9136G3.m9678d(linkedHashMap, c14438g);
        AbstractC16544l.m18092e(objM9678d, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) objM9678d;
    }

    /* JADX INFO: renamed from: b */
    public final String m19600b(C14438g c14438g) {
        Map mapM19599a = m19599a(c14438g, new C15058c(11));
        boolean zIsEmpty = mapM19599a.isEmpty();
        String str = this.f56947a;
        if (zIsEmpty) {
            return str;
        }
        try {
            C0675i c0675i = new C0675i();
            C19451a c19451a = new C19451a(c0675i, null);
            AbstractC7849B0.m8108c(c19451a, mapM19599a);
            c19451a.close();
            return str + '(' + c0675i.m1428Z0() + ')';
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
