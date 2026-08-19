package com.revenuecat.purchases.utils;

import java.util.function.Function;
import p049Bm.InterfaceC1436k;
import p817j$.util.function.Function$CC;

/* JADX INFO: renamed from: com.revenuecat.purchases.utils.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12773a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1436k f40450b;

    public /* synthetic */ C12773a(int i10, InterfaceC1436k interfaceC1436k) {
        this.f40449a = i10;
        this.f40450b = interfaceC1436k;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i10 = this.f40449a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f40449a) {
            case 0:
                return EventsFileHelper.C127701.invoke$lambda$0(this.f40450b, obj);
            default:
                return EventsFileHelper.C127711.invoke$lambda$0(this.f40450b, obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i10 = this.f40449a;
        return Function$CC.$default$compose(this, function);
    }
}
