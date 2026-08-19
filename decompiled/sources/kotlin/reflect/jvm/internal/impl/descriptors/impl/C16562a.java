package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16562a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ TypeSubstitutor f51657Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ FunctionDescriptorImpl f51658Z;

    public C16562a(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitutor typeSubstitutor) {
        this.f51658Z = functionDescriptorImpl;
        this.f51657Y = typeSubstitutor;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        SmartList smartList = new SmartList();
        Iterator<? extends FunctionDescriptor> it = this.f51658Z.getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            smartList.add(it.next().substitute(this.f51657Y));
        }
        return smartList;
    }
}
