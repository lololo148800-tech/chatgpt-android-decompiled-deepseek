package kotlinx.serialization.internal;

import ao.InterfaceC11127C;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m */
    public final boolean f53317m;

    public InlineClassDescriptor(String str, InterfaceC11127C interfaceC11127C) {
        super(str, interfaceC11127C, 1);
        this.f53317m = true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f53318a.equals(serialDescriptor.mo10679a())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.f53317m && Arrays.equals((SerialDescriptor[]) this.f53328k.getValue(), (SerialDescriptor[]) inlineClassDescriptor.f53328k.getValue())) {
                    int iMo10682e = serialDescriptor.mo10682e();
                    int i10 = this.f53320c;
                    if (i10 == iMo10682e) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (AbstractC16544l.m18089b(mo10685h(i11).mo10679a(), serialDescriptor.mo10685h(i11).mo10679a()) && AbstractC16544l.m18089b(mo10685h(i11).getKind(), serialDescriptor.mo10685h(i11).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f53317m;
    }
}
