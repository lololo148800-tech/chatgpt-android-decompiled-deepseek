package p857kl;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kl.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C16440G implements Comparable {

    /* JADX INFO: renamed from: o0 */
    public static final C16440G f51001o0;

    /* JADX INFO: renamed from: p0 */
    public static final C16440G f51002p0;

    /* JADX INFO: renamed from: q0 */
    public static final C16440G f51003q0;

    /* JADX INFO: renamed from: r0 */
    public static final C16440G f51004r0;

    /* JADX INFO: renamed from: s0 */
    public static final C16440G f51005s0;

    /* JADX INFO: renamed from: t0 */
    public static final C16440G f51006t0;

    /* JADX INFO: renamed from: u0 */
    public static final C16440G f51007u0;

    /* JADX INFO: renamed from: v0 */
    public static final C16440G f51008v0;

    /* JADX INFO: renamed from: w0 */
    public static final C16440G f51009w0;

    /* JADX INFO: renamed from: x0 */
    public static final C16440G f51010x0;

    /* JADX INFO: renamed from: y0 */
    public static final List f51011y0;

    /* JADX INFO: renamed from: z0 */
    public static final LinkedHashMap f51012z0;

    /* JADX INFO: renamed from: Y */
    public final int f51013Y;

    /* JADX INFO: renamed from: Z */
    public final String f51014Z;

    static {
        C16440G c16440g = new C16440G(100, "Continue");
        C16440G c16440g2 = new C16440G(101, "Switching Protocols");
        C16440G c16440g3 = new C16440G(102, "Processing");
        C16440G c16440g4 = new C16440G(RCHTTPStatusCodes.SUCCESS, "OK");
        C16440G c16440g5 = new C16440G(RCHTTPStatusCodes.CREATED, "Created");
        C16440G c16440g6 = new C16440G(202, "Accepted");
        C16440G c16440g7 = new C16440G(203, "Non-Authoritative Information");
        C16440G c16440g8 = new C16440G(204, "No Content");
        C16440G c16440g9 = new C16440G(205, "Reset Content");
        C16440G c16440g10 = new C16440G(206, "Partial Content");
        C16440G c16440g11 = new C16440G(207, "Multi-Status");
        C16440G c16440g12 = new C16440G(RCHTTPStatusCodes.UNSUCCESSFUL, "Multiple Choices");
        f51001o0 = c16440g12;
        C16440G c16440g13 = new C16440G(301, "Moved Permanently");
        f51002p0 = c16440g13;
        C16440G c16440g14 = new C16440G(302, "Found");
        f51003q0 = c16440g14;
        C16440G c16440g15 = new C16440G(303, "See Other");
        f51004r0 = c16440g15;
        C16440G c16440g16 = new C16440G(RCHTTPStatusCodes.NOT_MODIFIED, "Not Modified");
        C16440G c16440g17 = new C16440G(305, "Use Proxy");
        C16440G c16440g18 = new C16440G(306, "Switch Proxy");
        C16440G c16440g19 = new C16440G(307, "Temporary Redirect");
        f51005s0 = c16440g19;
        C16440G c16440g20 = new C16440G(308, "Permanent Redirect");
        f51006t0 = c16440g20;
        C16440G c16440g21 = new C16440G(RCHTTPStatusCodes.BAD_REQUEST, "Bad Request");
        f51007u0 = c16440g21;
        C16440G c16440g22 = new C16440G(HttpStatusCode.UNAUTHORIZED_401, "Unauthorized");
        f51008v0 = c16440g22;
        C16440G c16440g23 = new C16440G(402, "Payment Required");
        f51009w0 = c16440g23;
        C16440G c16440g24 = new C16440G(403, "Forbidden");
        C16440G c16440g25 = new C16440G(404, "Not Found");
        f51010x0 = c16440g25;
        List listM19382k = AbstractC17681o.m19382k(c16440g, c16440g2, c16440g3, c16440g4, c16440g5, c16440g6, c16440g7, c16440g8, c16440g9, c16440g10, c16440g11, c16440g12, c16440g13, c16440g14, c16440g15, c16440g16, c16440g17, c16440g18, c16440g19, c16440g20, c16440g21, c16440g22, c16440g23, c16440g24, c16440g25, new C16440G(405, "Method Not Allowed"), new C16440G(406, "Not Acceptable"), new C16440G(407, "Proxy Authentication Required"), new C16440G(408, "Request Timeout"), new C16440G(HttpStatusCode.CONFLICT_409, "Conflict"), new C16440G(410, "Gone"), new C16440G(411, "Length Required"), new C16440G(412, "Precondition Failed"), new C16440G(HttpStatusCode.PAYLOAD_TOO_LARGE_413, "Payload Too Large"), new C16440G(414, "Request-URI Too Long"), new C16440G(415, "Unsupported Media Type"), new C16440G(416, "Requested Range Not Satisfiable"), new C16440G(417, "Expectation Failed"), new C16440G(HttpStatusCode.UNPROCESSABLE_ENTITY_422, "Unprocessable Entity"), new C16440G(423, "Locked"), new C16440G(424, "Failed Dependency"), new C16440G(425, "Too Early"), new C16440G(426, "Upgrade Required"), new C16440G(HttpStatusCode.TOO_MANY_REQUESTS_429, "Too Many Requests"), new C16440G(431, "Request Header Fields Too Large"), new C16440G(500, "Internal Server Error"), new C16440G(501, "Not Implemented"), new C16440G(HttpStatusCode.BAD_GATEWAY_502, "Bad Gateway"), new C16440G(503, "Service Unavailable"), new C16440G(504, "Gateway Timeout"), new C16440G(505, "HTTP Version Not Supported"), new C16440G(506, "Variant Also Negotiates"), new C16440G(507, "Insufficient Storage"));
        f51011y0 = listM19382k;
        List list = listM19382k;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((C16440G) obj).f51013Y), obj);
        }
        f51012z0 = linkedHashMap;
    }

    public C16440G(int i10, String description) {
        AbstractC16544l.m18094g(description, "description");
        this.f51013Y = i10;
        this.f51014Z = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C16440G other = (C16440G) obj;
        AbstractC16544l.m18094g(other, "other");
        return this.f51013Y - other.f51013Y;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16440G) && ((C16440G) obj).f51013Y == this.f51013Y;
    }

    public final int hashCode() {
        return this.f51013Y;
    }

    public final String toString() {
        return this.f51013Y + ' ' + this.f51014Z;
    }
}
