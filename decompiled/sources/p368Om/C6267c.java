package p368Om;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Om.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6267c implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final ModuleDescriptor f20361Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f20362Z;

    public C6267c(ModuleDescriptor moduleDescriptor, boolean z6) {
        this.f20361Y = moduleDescriptor;
        this.f20362Z = z6;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC3776x[] interfaceC3776xArr = JvmBuiltIns.f51365h;
        return new JvmBuiltIns.Settings(this.f20361Y, this.f20362Z);
    }
}
