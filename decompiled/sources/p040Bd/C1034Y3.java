package p040Bd;

import ao.AbstractC11137K;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;

/* JADX INFO: renamed from: Bd.Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1034Y3 extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C1034Y3 f2861d = new C1034Y3(AbstractC16526C.f51263a.mo5693b(InterfaceC1028X3.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        if (element instanceof AbstractC16645d) {
            return C1016V3.Companion.serializer();
        }
        if (!(element instanceof C16644c)) {
            throw new IllegalStateException(("Unknown multimodal text content part type: " + element).toString());
        }
        AbstractC16643b abstractC16643b = (AbstractC16643b) ((C16644c) element).get("content_type");
        if (abstractC16643b instanceof AbstractC16645d) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643b;
            if (abstractC16645d.mo12923j()) {
                String strMo12922f = abstractC16645d.mo12922f();
                switch (strMo12922f.hashCode()) {
                    case -2097138850:
                        if (strMo12922f.equals("real_time_user_audio_video_asset_pointer")) {
                            return C0998S3.Companion.serializer();
                        }
                        break;
                    case -2072904727:
                        if (strMo12922f.equals("audio_transcription")) {
                            return C0957L3.Companion.serializer();
                        }
                        break;
                    case 1320476485:
                        if (strMo12922f.equals("audio_asset_pointer")) {
                            return C0939I3.Companion.serializer();
                        }
                        break;
                    case 1606770698:
                        if (strMo12922f.equals("image_asset_pointer")) {
                            return C0981P3.Companion.serializer();
                        }
                        break;
                }
                return C1022W3.INSTANCE.serializer();
            }
        }
        throw new IllegalStateException(("Expected type to be a JsonPrimitive, but was " + abstractC16643b).toString());
    }
}
