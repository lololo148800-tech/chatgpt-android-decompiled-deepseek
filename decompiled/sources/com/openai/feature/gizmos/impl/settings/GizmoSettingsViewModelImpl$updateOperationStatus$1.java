package com.openai.feature.gizmos.impl.settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p550We.C8826g;
import p550We.C8829j;
import p550We.EnumC8830k;
import p622Ze.C10298p;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZe/p;", "invoke", "(LZe/p;)LZe/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoSettingsViewModelImpl$updateOperationStatus$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38173Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f38174Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC8830k f38175o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$updateOperationStatus$1(String str, C16525B c16525b, EnumC8830k enumC8830k) {
        super(1);
        this.f38173Y = str;
        this.f38174Z = c16525b;
        this.f38175o0 = enumC8830k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8826g c8826g;
        C10298p setState = (C10298p) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C8826g c8826g2 = setState.f30585d;
        if (c8826g2 != null) {
            List<C8829j> list = c8826g2.f27012a;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (C8829j c8829j : list) {
                if (AbstractC16544l.m18089b(c8829j.f27015a, this.f38173Y)) {
                    Map map = C17690x.f56481Y;
                    Map map2 = c8829j.f27017c;
                    this.f38174Z.f51262Y = (map2 == null ? map : map2).get("all");
                    if (map2 != null) {
                        map = map2;
                    }
                    Map mapM19249k = AbstractC17659D.m19249k(map, new C17309l("all", this.f38175o0));
                    String actionId = c8829j.f27015a;
                    AbstractC16544l.m18094g(actionId, "actionId");
                    c8829j = new C8829j(actionId, c8829j.f27016b, mapM19249k, c8829j.f27018d);
                }
                arrayList.add(c8829j);
            }
            c8826g = new C8826g(arrayList);
        } else {
            c8826g = null;
        }
        return C10298p.m10880e(setState, null, null, c8826g, 7);
    }
}
