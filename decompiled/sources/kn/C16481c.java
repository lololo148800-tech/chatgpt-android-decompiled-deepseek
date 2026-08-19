package kn;

import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: kn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C16481c implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51125Y;

    /* JADX INFO: renamed from: Z */
    public final StaticScopeForKotlinEnum f51126Z;

    public /* synthetic */ C16481c(StaticScopeForKotlinEnum staticScopeForKotlinEnum, int i10) {
        this.f51125Y = i10;
        this.f51126Z = staticScopeForKotlinEnum;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.f51126Z;
        switch (this.f51125Y) {
            case 0:
                return AbstractC17681o.m19382k(DescriptorFactory.createEnumValueOfMethod(staticScopeForKotlinEnum.f52939a), DescriptorFactory.createEnumValuesMethod(staticScopeForKotlinEnum.f52939a));
            default:
                return staticScopeForKotlinEnum.f52940b ? AbstractC17681o.m19383l(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.f52939a)) : C17689w.f56480Y;
        }
    }
}
