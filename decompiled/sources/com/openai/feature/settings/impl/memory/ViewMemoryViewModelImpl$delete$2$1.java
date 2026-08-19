package com.openai.feature.settings.impl.memory;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p406Qg.C6704O;
import p506Ug.C7671f;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQg/O;", "invoke", "(LQg/O;)LQg/O;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewMemoryViewModelImpl$delete$2$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7671f f39671Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMemoryViewModelImpl$delete$2$1(C7671f c7671f) {
        super(1);
        this.f39671Y = c7671f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ArrayList arrayListM19357g0;
        C6704O setState = (C6704O) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = setState.f21542f;
        if (list != null) {
            arrayListM19357g0 = AbstractC17680n.m19357g0(list, this.f39671Y);
        } else {
            arrayListM19357g0 = null;
        }
        return C6704O.m7183e(setState, null, false, false, null, arrayListM19357g0, null, false, null, null, 991);
    }
}
