package co;

import ao.C11126B0;
import ao.C11189s0;
import ao.C11195v0;
import ao.C11201y0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: co.G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11806G {

    /* JADX INFO: renamed from: a */
    public static final Set f35794a = AbstractC17678l.m19293P(new SerialDescriptor[]{C11195v0.f33852b, C11201y0.f33868b, C11189s0.f33842b, C11126B0.f33747b});

    /* JADX INFO: renamed from: a */
    public static final boolean m13070a(SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f35794a.contains(serialDescriptor);
    }
}
