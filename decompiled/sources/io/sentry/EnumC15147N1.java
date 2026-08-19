package io.sentry;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import java.util.Locale;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.N1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15147N1 implements InterfaceC15374i0 {
    OK(RCHTTPStatusCodes.SUCCESS, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(RCHTTPStatusCodes.BAD_REQUEST),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(HttpStatusCode.CONFLICT_409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(HttpStatusCode.TOO_MANY_REQUESTS_429),
    FAILED_PRECONDITION(RCHTTPStatusCodes.BAD_REQUEST),
    ABORTED(HttpStatusCode.CONFLICT_409),
    OUT_OF_RANGE(RCHTTPStatusCodes.BAD_REQUEST),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(HttpStatusCode.UNAUTHORIZED_401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    EnumC15147N1(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    public static EnumC15147N1 fromHttpStatusCode(int i10) {
        for (EnumC15147N1 enumC15147N1 : values()) {
            if (enumC15147N1.matches(i10)) {
                return enumC15147N1;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(name().toLowerCase(Locale.ROOT));
    }

    public static EnumC15147N1 fromHttpStatusCode(Integer num, EnumC15147N1 enumC15147N1) {
        EnumC15147N1 enumC15147N1FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC15147N1;
        return enumC15147N1FromHttpStatusCode != null ? enumC15147N1FromHttpStatusCode : enumC15147N1;
    }

    EnumC15147N1(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
