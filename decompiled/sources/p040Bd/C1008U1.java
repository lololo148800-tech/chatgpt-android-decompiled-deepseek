package p040Bd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11137K;
import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import livekit.org.webrtc.MediaStreamTrack;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Bd.U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1008U1 extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C1008U1 f2803d = new C1008U1(AbstractC16526C.f51263a.mo5693b(AbstractC0985Q1.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("type");
        String strM12913f = abstractC16643b != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b)) : null;
        if (AbstractC17680n.m19333J((Iterable) C0996S1.f2788o0, strM12913f)) {
            return C0919F1.Companion.serializer();
        }
        if (strM12913f != null) {
            switch (strM12913f.hashCode()) {
                case -1986511634:
                    if (strM12913f.equals("title_citation")) {
                        return C1204z1.Companion.serializer();
                    }
                    break;
                case -1872026697:
                    if (strM12913f.equals("url_citation")) {
                        return C0937I1.Companion.serializer();
                    }
                    break;
                case -1772041717:
                    if (strM12913f.equals("businesses_map")) {
                        return C0893B.Companion.serializer();
                    }
                    break;
                case -1538953090:
                    if (strM12913f.equals("file_navlist")) {
                        return C0971O.Companion.serializer();
                    }
                    break;
                case -1217487446:
                    if (strM12913f.equals(ParameterNames.HIDDEN)) {
                        return C1149q0.Companion.serializer();
                    }
                    break;
                case -1138529534:
                    if (strM12913f.equals("calculator")) {
                        return C0911E.Companion.serializer();
                    }
                    break;
                case -859600928:
                    if (strM12913f.equals("image_v2")) {
                        return C1203z0.Companion.serializer();
                    }
                    break;
                case -356324843:
                    if (strM12913f.equals("webpage_extended")) {
                        return C0937I1.Companion.serializer();
                    }
                    break;
                case 3560141:
                    if (strM12913f.equals("time")) {
                        return C1186w1.Companion.serializer();
                    }
                    break;
                case 3562758:
                    if (strM12913f.equals("tldr")) {
                        return C0901C1.Companion.serializer();
                    }
                    break;
                case 109770518:
                    if (strM12913f.equals("stock")) {
                        return C1168t1.Companion.serializer();
                    }
                    break;
                case 112202875:
                    if (strM12913f.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        return C0979P1.Companion.serializer();
                    }
                    break;
                case 284013130:
                    if (strM12913f.equals("file_citation")) {
                        return C0935I.Companion.serializer();
                    }
                    break;
                case 384760663:
                    if (strM12913f.equals("sports_schedule")) {
                        return C1013V0.Companion.serializer();
                    }
                    break;
                case 445535409:
                    if (strM12913f.equals("grouped_webpages")) {
                        return C1113k0.Companion.serializer();
                    }
                    break;
                case 466733563:
                    if (strM12913f.equals("forecast")) {
                        return C1092h0.Companion.serializer();
                    }
                    break;
                case 841787023:
                    if (strM12913f.equals("optimistic_image_inline")) {
                        return C1203z0.Companion.serializer();
                    }
                    break;
                case 1224238051:
                    if (strM12913f.equals("webpage")) {
                        return C0937I1.Companion.serializer();
                    }
                    break;
                case 1240399079:
                    if (strM12913f.equals("sports_standings")) {
                        return C1031Y0.Companion.serializer();
                    }
                    break;
                case 1295784455:
                    if (strM12913f.equals("sources_footnote")) {
                        return C0995S0.Companion.serializer();
                    }
                    break;
                case 1862666772:
                    if (strM12913f.equals("navigation")) {
                        return C0960M0.Companion.serializer();
                    }
                    break;
                case 2093415994:
                    if (strM12913f.equals("nav_list")) {
                        return C0924G0.Companion.serializer();
                    }
                    break;
            }
        }
        return C0919F1.Companion.serializer();
    }
}
