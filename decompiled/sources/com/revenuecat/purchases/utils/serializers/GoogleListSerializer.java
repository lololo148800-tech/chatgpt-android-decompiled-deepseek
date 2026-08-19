package com.revenuecat.purchases.utils.serializers;

import bo.AbstractC11523k;
import bo.InterfaceC11522j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16642a;
import livekit.LivekitInternal$NodeStats;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/serializers/GoogleListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/util/List;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GoogleListSerializer implements KSerializer {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final SerialDescriptor descriptor = AbstractC11336c.m12772b("GoogleList", C10104e.f29918j);

    private GoogleListSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public List<String> deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        InterfaceC11522j interfaceC11522j = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
        if (interfaceC11522j == null) {
            throw new IllegalStateException("This serializer can be used only with JSON format");
        }
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(interfaceC11522j.mo12907j()).get("google");
        C16642a c16642aM12916i = abstractC16643b != null ? AbstractC11523k.m12916i(abstractC16643b) : null;
        if (c16642aM12916i == null) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c16642aM12916i, 10));
        Iterator it = c16642aM12916i.f53330Y.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC11523k.m12918k((AbstractC16643b) it.next()).mo12922f());
        }
        return arrayList;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, List<String> value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
