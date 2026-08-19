package kotlinx.serialization.json;

import bo.C11533u;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C11533u.class)
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JsonNull extends AbstractC16645d {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.AbstractC16645d
    /* JADX INFO: renamed from: f */
    public final String mo12922f() {
        return "null";
    }

    @Override // kotlinx.serialization.json.AbstractC16645d
    /* JADX INFO: renamed from: j */
    public final boolean mo12923j() {
        return false;
    }

    public final KSerializer serializer() {
        return C11533u.f34896a;
    }
}
