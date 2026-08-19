package com.openai.feature.conversations.impl.compliance;

import ee.AbstractC13371f;
import ee.C13370e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p359Oc.C6168d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lee/f;", "invoke", "(Lee/f;)Lee/f;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ComplianceViewModelImpl$updateNonComplianceState$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean f37557Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Boolean f37558Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6168d f37559o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceViewModelImpl$updateNonComplianceState$1(Boolean bool, Boolean bool2, C6168d c6168d) {
        super(1);
        this.f37557Y = bool;
        this.f37558Z = bool2;
        this.f37559o0 = c6168d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC13371f setState = (AbstractC13371f) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        if (!(setState instanceof C13370e)) {
            return setState;
        }
        Boolean bool = this.f37557Y;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : ((C13370e) setState).f42409b;
        Boolean bool2 = this.f37558Z;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : ((C13370e) setState).f42410c;
        C6168d warning = this.f37559o0;
        if (warning == null) {
            warning = ((C13370e) setState).f42408a;
        }
        AbstractC16544l.m18094g(warning, "warning");
        return new C13370e(warning, zBooleanValue, zBooleanValue2);
    }
}
